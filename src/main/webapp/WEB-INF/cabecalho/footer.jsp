<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<footer class="rodape">
	<img class="img-footer" alt="[PH - Soluções em Informatica]"
		title="PH - Soluções em Informatica" src='<c:url value="/img/rodape.jpg"/>' />
</footer>
</body>
<script>
	var offset = $('#fixMenu').offset().top;
	var $fixMenu = $('#fixMenu');
	$(document).on('scroll', function() {
		if (offset <= $(window).scrollTop()) {
			$fixMenu.addClass('fixar');
		} else {
			$fixMenu.removeClass('fixar');
		}
	})
</script>
</html>