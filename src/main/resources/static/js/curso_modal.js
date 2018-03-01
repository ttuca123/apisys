function openRemoveModal(id){
			$.ajax({
				url: "/remove-curso/" + id,
				success: function(data){
					$("#removeCursoModalHolder").html(data);
					$('#removeCursoModal').modal({
						backdrop: 'static'
					});
				}
			});
		}
		
		function openEditModal(id){
			$.ajax({
				url: "/edit-curso/" + id,
				success: function(data){
					$("#editCursoModalHolder").html(data);
					$("#editCursoModal").modal({
						backdrop: 'static'
					});
				}
			});
		}
		
		function openAddCursoModal() {
			$.ajax({
				url: "/add-curso",
				success: function(data){
					$("#addCursoModalHolder").html(data);
					$('#addCursoModal').modal({
						backdrop: 'static'
					});
				}
			});
		}