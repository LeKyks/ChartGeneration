package fr.univcotedazurl3ia.project.generator

import java.io.*;
import java.util.Scanner;

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.univcotedazurl3ia.project.ChartItAS.Program
import fr.univcotedazurl3ia.project.ChartItAS.ChartType
import fr.univcotedazurl3ia.project.ChartItAS.Chart
import org.eclipse.emf.common.util.EList
import fr.univcotedazurl3ia.project.ChartItAS.Data
import fr.univcotedazurl3ia.project.ChartItAS.Col
import fr.univcotedazurl3ia.project.ChartItAS.Color
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
class CSVReader {
    def static csvReader(String filePath){
        val data=new ArrayList
        val file=new File(filePath)
        val sc = new Scanner(file)
        sc.useDelimiter(";")
        while(sc.hasNextLine){
            val line=sc.nextLine
            val values=line.split(";")
            var row=new ArrayList
            
            for(v:values){
                row.add(v)
            }
            data.add(row)
        }
        sc.close
        return data
    }
}
 
 
 
class ChartItGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val program= resource.contents.head as Program
        fsa.generateFile(program.name+".html",generateHTMLCode(program))
    }
    
    def String generateHTMLCode(Program prog) {
        var js = ""
        var chartH = ""
        var dataLoad = ""
        for (chart : prog.chart) {
            chartH += generateHTMLChart(chart)
            js += generateChart(chart)
            dataLoad+=generateData(chart)
        }
        return '''
            <!DOCTYPE html>
            <html>
                <head>
                    <title>ChartIt - ''' + prog.name + '''</title>
                    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
                </head>
                <body>
                    <div style=" display:flex;flex-direction:column;justify-content:center;align-items:center;overflow: auto;">
                        ''' + chartH + '''
                    </div>
                    <script>
                        '''+ dataLoad +'''
                        
                        '''+ js +'''
                    </script>
                </body>
            </html>
        '''
    }
    
    def String generateHTMLChart(Chart chart){
        return 
        '''
        <div style=" display:flex;flex-direction:column;justify-content:center;align-items:center;overflow:auto;height:100vh;flex-grow: 1;background-color:'''+ findColor(chart.backgroundColor) +''';">
        	<h1>'''+ chart.name +'''</h1>
            <canvas id="'''+ chart.name +'''" style="display: flex; box-sizing: border-box;align-items: center;justify-content: center;height: 100%;width: 100%;";></canvas>
        </div>
        '''
    }
    
    def String generateChart(Chart chart) {
        var dataset=""
        for(col:chart.col){
        	if(!(col==chart.col.get(0))){
        		dataset+=
	        	'''
	        	{
	        		label: "'''+ col.label +'''",
		       		data: '''+ chart.data.name +'''.map(row => row.'''+ col.name +'''),
					fill: true,
					backgroundColor: "'''+ findColor(col.color) +'''",
	        	},
	        	'''
        	}
        	
        }
        return '''
            new Chart(
                document.getElementById("'''+ chart.name +'''"),
                {
                    type:"'''+ chart.type.toString().toLowerCase() +'''",
                    data: {
                        labels: '''+ chart.data.name +'''.map(row => row.'''+ chart.col.get(0).name +'''),
                        datasets: [
                            '''+ dataset +'''
                        ]
                    },
                }
            );
        '''
    }
    
    def String findColor(Color color){
        switch color{
            case color==Color.BLUE:return "rgba(25,121,169,1)"
            case color==Color.BLACK:return"rgba(28,16,11,1)"
            case color==Color.BROWN:return"rgba(128,57,30,1)"
            case color==Color.PINK:return"rgba(234, 71, 193,1)"
            case color==Color.ORANGE:return"rgba(253, 143, 23,1)"
            case color==Color.PURPLE:return"rgba(154, 27, 143,1)"
            case color==Color.RED:return"rgba(226, 21, 24,1)"
            case color==Color.LIGHT_GREY:return"rgba(189, 184, 184,1)"
            case color==Color.DARK_GREY:return"rgba(88, 86, 86,1)"
            case color==Color.GREEN:return"rgba(36, 234, 36,1)"
            case color==Color.YELLOW:return"rgba(231, 234, 36,1)"
            case color==Color.WHITE:return"rgba(255,255,255,1"
            
        }
    }
    
    def String generateData(Chart chart) {
        val dataList=CSVReader.csvReader(chart.data.path)
        var header= dataList.get(0)
        var type=dataList.get(1)
        dataList.remove(1)
        dataList.remove(0)
        var colIndex=new ArrayList
        var dLine=""
        for(col:chart.col){
            if (header.contains(col.name)){
                colIndex.add(header.indexOf(col.name))
            }
        }
        var i=0
        var dLines=""
        var h=""
        var v=""
        for(line:dataList){
            var dObj=""
            var y=line.length
            for(colI:colIndex){
                if(colI<=y){
                	h=header.get(colI)
                	v=line.get(colI)
                    if(type.get(colI).toLowerCase=="int" || type.get(colI).toLowerCase=="double"){
                    	if(v==" " || v==""){
                    		dObj+=h+ " : 0," 
                    	}
                    	else{
                    		dObj+=h+ " : "+ v +"," 
                    	}
                    }
                    else {
                        if(v==" " || v==""){
                    		dObj+=h+ ''': "Unknown",''' 
                    	}
                    	else {
                    		dObj+=h+ ''': " '''+ v +''' ", '''
                    	}
                    }
                }   
            }
            i=dObj.length
            if(i!=0){
                dObj=dObj.substring(0,i-1)
            }
            dLine+='''{'''+ dObj +'''},
            ''' 
        }
        i=dLine.length
        if(i!=0){
            dLines=dLine.substring(0,i-1)
        }
        return '''const '''+chart.data.name+'''= [
                        '''+ dLines +''' 
               ];
               '''
    }
}
