function openRemoveModal(id){
			$.ajax({
				url: "/remove-aluno/" + id,
				success: function(data){
					$("#removeAlunoModalHolder").html(data);
					$('#removeAlunoModal').modal({
						backdrop: 'static'
					});
				}
			});
		}
		
		function openEditModal(id){
			$.ajax({
				url: "/edit-aluno/" + id,
				success: function(data){
					$("#editAlunoModalHolder").html(data);
					$("#editAlunoModal").modal({
						backdrop: 'static'
					});
				}
			});
		}
		
		function openAddAlunoModal() {
			$.ajax({
				url: "/add-aluno",
				success: function(data){
					$("#addAlunoModalHolder").html(data);
					$('#addAlunoModal').modal({
						backdrop: 'static'
					});
				}
			});
		}