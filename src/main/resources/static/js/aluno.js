    /**
     * @author Artur Cavalcante
     * @description Script responsável por automatizar o processo de crud com AJAX
     */

    
    function openAlunoModal(id){
    	
    	$.ajax({
    		url: "/alunos/"+id,
    		success: function(data){
    			
    			$("alunoModalHolder").html(data);
    			
    			$("alunoModal").modal("show");
    		}
    	})
    	
    	
    }