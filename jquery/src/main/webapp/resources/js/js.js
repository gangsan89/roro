

$(function() {
	$('.c').click(function(event) {
		$.ajax({
			url:"home",
			data:$('p').text(),
			
			dataType:'JSON',
			
			success:function(result){
				$('p').append(
						'<p/>'+result
				)
			}
		})

		
	});

})

/**
 * 
 * 
 * $(function(){ $('#para').click(function() {
 * $('#para').attr('style','color:red'); });
 * 
 * 
 * $('#para').mouseout(function() { $('#para').attr('style','color:black'); });
 * 
 * $('#btn').click(function() { console.log($('#btn').val()); });
 * 
 * $('#btn').click(function() { $('#para').text( $('#btn').val() ); });
 * 
 * $('#btn').click(function() { $('#para').text( $('#btn').val() );
 * $('#btn').append( '
 * <p>
 * 이벤트 처리 완료
 * </p>' ); }); })
 * 
 * 
 * $(function(){ $('#btn').click(function() { $('#para').text( $('#btn').val() );
 * append(); }); })
 * 
 * $(function(){ $('#btn').append( '
 * <p>
 * 이벤트 처리 완료
 * </p>' ); })
 * 
 * 
 * $('#btn').click(function() { $('p').text($('#hidden').val()); } );
 * 
 * 
 * 
 * 
 * 
 */

/**
 * $(function(){ sondole.log($('#para')); })
 * 
 * 은 해당 파일에
 * 
 * @returns
 */

