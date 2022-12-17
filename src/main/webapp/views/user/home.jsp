<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trang chủ</title>
</head>
<body>
	<div class="row">
	

		<div class="col-lg-3">

			<h5 class="my-4">Danh sách thể loại: </h5>

			<div class="list-group">
				<c:forEach var="cate" items="${categories}">
					<a href="#" class="list-group-item">${cate.getName()}</a>
				</c:forEach>

			</div>

		</div>
		<!-- /.col-lg-3 -->

		<div class="col-lg-9">

			<div id="carouselExampleIndicators" class="carousel slide my-4"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner" role="listbox">
					<div class="carousel-item active">
						<img class="d-block img-fluid"
							src="https://belizedivehaven.com/wp-content/uploads/2022/11/Blog-Img-20-scaled-900x350.jpg"
							alt="First slide">
					</div>
					<div class="carousel-item">
						<img class="d-block img-fluid"
							src="https://cdn.pp.slimpay.com/blog/2018/04/19095133/DZN-Blog-Hero-900x350-CardTech.jpg"
							alt="Second slide">
					</div>
					<div class="carousel-item">
						<img class="d-block img-fluid"
							src="https://qontigo.com/wp-content/uploads/2021/04/bondvalueblogpost_intro-900x350.png"
							alt="Third slide">
					</div>
					
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>

			<div class="row">

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href='<c:url value="/detail?number=number1"/>'><img class="card-img-top"
							src="https://static.ybox.vn/2022/5/6/1652523125860-lcf-blog-700x400.jpg" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href='<c:url value="/detail?number=number1"/>'>Bài Viết Số Một</a>
							</h4>
							<h5>$24.99</h5>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Amet numquam aspernatur!</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href='<c:url value="/detail?number=number2"/>'><img class="card-img-top"
							src="https://www.gloucestercitynews.net/.a/6a00d8341bf7d953ef022ad3aab7ed200b-800wi" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href='<c:url value="/detail?number=number2"/>'>Bài Viết Số Hai</a>
							</h4>
							<h5>$24.99</h5>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit
								amet.</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href='<c:url value="/detail?number=number3"/>'><img class="card-img-top"
							src="https://www.adobe.com/content/dam/cc/us/en/products/elements/2022/pepe/marquee/PEPE_WhatsNew_2_700x400.jpg" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href='<c:url value="/detail?number=number3"/>'>Bài Viết Số Ba</a>
							</h4>
							<h5>$24.99</h5>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Amet numquam aspernatur!</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href='<c:url value="/detail?number=number4"/>'><img class="card-img-top"
							src="https://www.phila.gov/media/20201006095949/Halloween-700x400.jpg" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href='<c:url value="/detail?number=number4"/>'>Bài Viết Số Bốn</a>
							</h4>
							<h5>$24.99</h5>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Amet numquam aspernatur!</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href='<c:url value="/detail?number=number5"/>'><img class="card-img-top"
							src="https://maac.edu.vn/wp-content/uploads/2021/12/Opim-700x400-1.jpg" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href='<c:url value="/detail?number=number5"/>'>Bài Viết Số Năm</a>
							</h4>
							<h5>$24.99</h5>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit
								amet.</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="https://s3-ap-southeast-1.amazonaws.com/storage.adpia.vn/affiliate_document/multi/pierrecardin-700x400-black-friday.jpg" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href='<c:url value="/detail?number=number6"/>'>Bài Viết Số Sáu</a>
							</h4>
							<h5>$24.99</h5>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Amet numquam aspernatur!</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>

			</div>
			<!-- /.row -->

		</div>
		<!-- /.col-lg-9 -->

	</div>
	<!-- /.row -->
</body>
</html>