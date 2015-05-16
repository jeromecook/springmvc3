<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<title>Cookbol, Pro futbol development</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:700italic,400,300,700' rel='stylesheet' type='text/css'>
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<!--  <script src="<c:url value="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" />"></script>
		-->
		<script src="<c:url value="/js/skel.min.js" />"></script>
		<script src="<c:url value="/js/skel-panels.min.js" />"></script>
		<script src="<c:url value=" /js/init.js" /> "></script>
	
		
<!--<script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script> -->

			<link  href="<c:url value="/css/skel-noscript.css" />" rel="stylesheet">
			<link  href="<c:url value="/css/style.css" />" rel="stylesheet" >
			<link  href="<c:url value="/css/style-desktop.css" />" rel="stylesheet">
		
		
		
		<!--[if lte IE 8]><link rel="stylesheet" href="/css/ie/v8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="/css/ie/v9.css" /><![endif]-->
		<link rel="stylesheet" href="css/global.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
	<script>
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: 'img/loading.gif',
				play: 5000,
				pause: 2500,
				hoverPause: true,
				animationStart: function(current){
					$('.caption').animate({
						bottom:-35
					},100);
					if (window.console && console.log) {
						// example return of current slide number
						console.log('animationStart on slide: ', current);
					};
				},
				animationComplete: function(current){
					$('.caption').animate({
						bottom:0
					},200);
					if (window.console && console.log) {
						// example return of current slide number
						console.log('animationComplete on slide: ', current);
					};
				},
				slidesLoaded: function() {
					$('.caption').animate({
						bottom:0
					},200);
				}
			});
		});
		</script>
	</head>
	<body class="homepage">

	<!-- Header -->
		<div id="header">
			<div class="container">
					
				<!-- Logo -->
					<div id="logo">
						<h1><a href="index">Cookbol</a></h1>
						
						
					</div>
				
				<!-- Nav -->
					<nav id="nav">
						<ul>
							<li class="active"><a href="index">Homepage</a></li>
							<li><a href="left-sidebar">Left Sidebar</a></li>
							<li><a href="right-sidebar">Right Sidebar</a></li>
							<li><a href="no-sidebar">No Sidebar</a></li>
						</ul>
					</nav>

			</div>
		</div>
	<!-- Header -->
	<!--start new jquery -->
	<div id="container">
	<div id="example">
		<img src="img/new-ribbon.png" width="112" height="112" alt="New Ribbon" id="ribbon">
		<div id="slides">
			<div class="slides_container">
				<div class="slide">
					<a href="http://www.flickr.com/photos/jliba/4665625073/" title="145.365 - Happy Bokeh Thursday! | Flickr - Photo Sharing!" target="_blank"><img src="img/slide-1.jpg" width="570" height="270" alt="Slide 1"></a>
					<div class="caption" style="bottom:0">
						<p>Happy Bokeh Thursday!</p>
					</div>
				</div>
				<div class="slide">
					<a href="http://www.flickr.com/photos/stephangeyer/3020487807/" title="Taxi | Flickr - Photo Sharing!" target="_blank"><img src="img/slide-2.jpg" width="570" height="270" alt="Slide 2"></a>
					<div class="caption">
						<p>Taxi</p>
					</div>
				</div>
				<div class="slide">
					<a href="http://www.flickr.com/photos/childofwar/2984345060/" title="Happy Bokeh raining Day | Flickr - Photo Sharing!" target="_blank"><img src="img/slide-3.jpg" width="570" height="270" alt="Slide 3"></a>
					<div class="caption">
						<p>Happy Bokeh raining Day</p>
					</div>
				</div>
				<div class="slide">
					<a href="http://www.flickr.com/photos/b-tal/117037943/" title="We Eat Light | Flickr - Photo Sharing!" target="_blank"><img src="img/slide-4.jpg" width="570" height="270" alt="Slide 4"></a>
					<div class="caption">
						<p>We Eat Light</p>
					</div>
				</div>
				<div class="slide">
					<a href="http://www.flickr.com/photos/bu7amd/3447416780/" title="&ldquo;I must go down to the sea again, to the lonely sea and the sky; and all I ask is a tall ship and a star to steer her by.&rdquo; | Flickr - Photo Sharing!" target="_blank"><img src="img/slide-5.jpg" width="570" height="270" alt="Slide 5"></a>
					<div class="caption">
						<p>&ldquo;I must go down to the sea again, to the lonely sea and the sky...&rdquo;</p>
					</div>
				</div>
				<div class="slide">
					<a href="http://www.flickr.com/photos/streetpreacher/2078765853/" title="twelve.inch | Flickr - Photo Sharing!" target="_blank"><img src="img/slide-6.jpg" width="570" height="270" alt="Slide 6"></a>
					<div class="caption">
						<p>twelve.inch</p>
					</div>
				</div>
				<div class="slide">
					<a href="http://www.flickr.com/photos/aftab/3152515428/" title="Save my love for loneliness | Flickr - Photo Sharing!" target="_blank"><img src="img/slide-7.jpg" width="570" height="270" alt="Slide 7"></a>
					<div class="caption">
						<p>Save my love for loneliness</p>
					</div>
				</div>
			</div>
			<a href="#" class="prev"><img src="img/arrow-prev.png" width="24" height="43" alt="Arrow Prev"></a>
			<a href="#" class="next"><img src="img/arrow-next.png" width="24" height="43" alt="Arrow Next"></a>
		</div>
		<img src="img/example-frame.png" width="739" height="341" alt="Example Frame" id="frame">
	</div>
 </div>	
	<!--end new jquery -->
		
	<!-- Banner 
		<div id="banner">
			<div class="container">
			</div>
		</div>
 /Banner -->

	<!-- Main -->
		<div id="page">

			<!-- Extra -->
			<div id="marketing" class="container">
				<div class="row">
					<div class="3u">
						<section>
							<header>
								<h2>Feugiat Tempus</h2>
							</header>
							<p class="subtitle">In posuere eleifend odio. Quisque semper augue mattis maecenas ligula.</p>
							<!-- <p><a href="#"><img src="images/pics13.jpg" alt=""></a></p>
							-->
							
							<object data=http://springmvc3-jeromecook.rhcloud.com/ width="282" height="150"> 
								<embed src=http://www.web-source.net width="282" height="150"> </embed>
									 Error: Embedded data could not be displayed. 
						    </object>
							<a href="#" class="button">More</a>
						</section>
					</div>
					<div class="3u">
						<section>
							<header>
								<h2>Maecenas lectus</h2>
							</header>
							<p class="subtitle">In posuere eleifend odio. Quisque semper augue mattis maecenas ligula.</p>
							<p><a href="#"><img src="images/pics14.jpg" alt=""></a></p>
							<a href="#" class="button">More</a>
						</section>
					</div>
					<div class="3u">
						<section>
							<header>
								<h2>Luctus lectus</h2>
							</header>
							<p class="subtitle">In posuere eleifend odio. Quisque semper augue mattis maecenas ligula.</p>
							<p><a href="#"><img src="images/pics15.jpg" alt=""></a></p>
							<a href="#" class="button">More</a>
						</section>
					</div>
					<div class="3u">
						<section>
							<header>
								<h2>Posuere eleifend</h2>
							</header>
							<p class="subtitle">In posuere eleifend odio. Quisque semper augue mattis maecenas ligula.</p>
							<p><a href="#"><img src="images/pics16.jpg" alt=""></a></p>
							<a href="#" class="button">More</a>
						</section>
					</div>
				</div>
			</div>
			<!-- /Extra -->
				
			<!-- Main -->
			<div id="main" class="container">
				<div class="row">
					<div class="6u">
						<section>
							<header>
								<h2>Integer gravida nibh quis urna</h2>
								<span class="byline">Augue praesent a lacus at urna congue rutrum</span>
							</header>
							<p>This is <strong>Ex Machina</strong>, a responsive HTML5 site template freebie by <a href="http://templated.co">TEMPLATED</a>. Released for free under the <a href="http://templated.co/license">Creative Commons Attribution</a> license, so use it for whatever (personal or commercial) &ndash; just give us credit! Check out more of our stuff at <a href="http://templated.co">our site</a> or follow us on <a href="http://twitter.com/templatedco">Twitter</a>.</p>
							<p>Sed etiam vestibulum velit, euismod lacinia quam nisl id lorem. Quisque erat. Vestibulum pellentesque, justo mollis pretium suscipit, justo nulla blandit libero, in blandit augue justo quis nisl. Fusce mattis viverra elit. Fusce quis tortor. Consectetuer adipiscing elit. Nam pede erat, porta eu, lobortis eget lorem ipsum dolor. Donec placerat odio vel elit. Nullam ante orci, pellentesque eget, tempus quis, ultrices in, est. Curabitur sit amet nulla. Nam in massa. Sed vel tellus. Curabitur sem urna, consequat. Sed etiam vestibulum velit, euismod lacinia quam nisl id lorem. Quisque erat.</p>
							<p>Sed etiam vestibulum velit, euismod lacinia quam nisl id lorem. Quisque erat. Vestibulum pellentesque, justo mollis pretium suscipit, justo nulla blandit libero, in blandit augue justo quis nisl. Fusce mattis viverra elit. Fusce quis tortor. Consectetuer adipiscing elit. Nam pede erat, porta eu, lobortis eget lorem ipsum dolor. Donec placerat odio vel elit. Nullam ante orci, pellentesque eget, tempus quis, ultrices in, est. Curabitur sit amet nulla. Nam in massa. Sed vel tellus. Curabitur sem urna, consequat. Sed etiam vestibulum velit, euismod lacinia quam nisl id lorem. Quisque erat.</p>
							<a href="#" class="button">More Details</a>
						</section>
					</div>
					<div class="3u">
						<section class="sidebar">
							<header>
								<h2>Feugiat Tempus</h2>
							</header>
							<ul class="style2">
								<li>
									<a href="#"><img src="images/pics07.jpg" alt=""></a>
									<p>Donec leo, vivamus fermentum augue praesent a lacus at urna rutrum.</p>
								</li>
								<li>
									<a href="#"><img src="images/pics08.jpg" alt=""></a>
									<p>Donec leo, vivamus fermentum augue praesent a lacus at urna rutrum.</p>
								</li>
								<li>
									<a href="#"><img src="images/pics09.jpg" alt=""></a>
									<p>Donec leo, vivamus fermentum augue praesent a lacus at urna rutrum.</p>
								</li>
								<li>
									<a href="#"><img src="images/pics10.jpg" alt=""></a>
									<p>Donec leo, vivamus fermentum augue praesent a lacus at urna rutrum.</p>
								</li>
							</ul>						
						</section>
					</div>
					<div class="3u">
						<section class="sidebar">
							<header>
								<h2>Feugiat Tempus</h2>
							</header>
							<ul class="style1">
								<li><a href="#">Maecenas luctus lectus at sapien</a></li>
								<li><a href="#">Etiam rhoncus volutpat erat</a></li>
								<li><a href="#">Donec dictum metus in sapien</a></li>
								<li><a href="#">Nulla luctus eleifend purus</a></li>
								<li><a href="#">Maecenas luctus lectus at sapien</a></li>
							</ul>
						</section>
						<section class="sidebar">
							<header>
								<h2>Nulla luctus eleifend</h2>
							</header>
							<ul class="style1">
								<li><a href="#">Maecenas luctus lectus at sapien</a></li>
								<li><a href="#">Donec dictum metus in sapien</a></li>
								<li><a href="#">Integer gravida nibh quis urna</a></li>
								<li><a href="#">Etiam posuere augue sit amet nisl</a></li>
								<li><a href="#">Mauris vulputate dolor sit amet nibh</a></li>
							</ul>
						</section>
					</div>
				</div>
			</div>
			<!-- Main -->

		</div>
	<!-- /Main -->

	<!-- Featured -->
		<div id="featured">
			<div class="container">
				<div class="row">
					<section class="4u">
						<div class="box">
							<a href="#" class="image left"><img src="images/pics04.jpg" alt=""></a>
							<h3>Etiam posuere augue</h3>
							<p>Donec nonummy magna quis risus eleifend. </p>
							<a href="#" class="button">More</a>
						</div>
					</section>
					<section class="4u">
						<div class="box">
							<a href="#" class="image left"><img src="images/pics05.jpg" alt=""></a>
							<h3>Etiam posuere augue</h3>
							<p>Donec nonummy magna quis risus eleifend. </p>
							<a href="#" class="button">More</a>
						</div>
					</section>
					<section class="4u">
						<div class="box">
							<a href="#" class="image left"><img src="images/pics06.jpg" alt=""></a>
							<h3>Etiam posuere augue</h3>
							<p>Donec nonummy magna quis risus eleifend. </p>
							<a href="#" class="button">More</a>
						</div>
					</section>
				</div>
				<div class="divider"></div>
			</div>
		</div>
	<!-- /Featured -->

	<!-- Footer -->
		<div id="footer">
			<div class="container">
				<div class="row">
					<div class="3u">
						<section>
							<h2>Maecenas lectus</h2>
							<div class="balloon">
								<blockquote>&ldquo;&nbsp;&nbsp;Donec leo, vivamus ullamcorper fermentum nibh in augue pulvinar ullamcorper metus praesent a lacus at urna congue ullamcorper  rutrum.&nbsp;&nbsp;&rdquo;<br>
									<br>
									<strong>&ndash;&nbsp;&nbsp;John Smith</strong></blockquote>
							</div>
							<div class="ballon-bgbtm">&nbsp;</div>
						</section>
					</div>
					<div class="3u">
						<section>
							<h2>Donec dictum</h2>
							<ul class="default">
								<li>
									<h3>Mauris vulputate dolor sit amet</h3>
									<p><a href="#">Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum.</a></p>
								</li>
								<li>
									<h3>Fusce ultrices fringilla metus</h3>
									<p><a href="#">Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum.</a></p>
								</li>
								<li>
									<h3>Donec dictum metus in sapien</h3>
									<p><a href="#">Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum.</a></p>
								</li>
							</ul>
						</section>
					</div>
					<div class="3u">
						<section>
							<h2>Nulla leifend</h2>
							<p>Donec placerat odio vel elit. Nullam ante orci, pellentesque eget, tempus quis, ultrices in, est. Curabitur sit amet nulla. Nam in massa. Sed vel tellus. Curabitur sem urna, consequat.</p>
							<ul class="style5">
								<li><a href="#"><img src="images/pics07.jpg" alt=""></a></li>
								<li><a href="#"><img src="images/pics08.jpg" alt=""></a></li>
								<li><a href="#"><img src="images/pics09.jpg" alt=""></a></li>
								<li><a href="#"><img src="images/pics10.jpg" alt=""></a></li>
								<li><a href="#"><img src="images/pics11.jpg" alt=""></a></li>
								<li><a href="#"><img src="images/pics12.jpg" alt=""></a></li>
							</ul>
							<a href="#" class="button">More Collections</a>
						</section>
					</div>
					<div class="3u">
						<section>
							<h2>Luctus eleifend</h2>
							<p><strong>Aliquam erat volutpat. Pellentesque tristique ante ut risus. </strong></p>
							<p>Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh. Suspendisse dictum porta lectus. Donec placerat odio vel elit.</p>
							<p>Donec placerat odio vel elit. Nullam ante orci, pellentesque eget, tempus quis, ultrices in, est. Curabitur sit amet nulla. Nam in massa. Sed vel tellus. Curabitur sem urna, consequat.</p>
							<a href="#" class="button">More Collections</a>
						</section>
					</div>
				</div>
			</div>
		</div>
	<!-- /Footer -->

	<!-- Copyright -->
		<div id="copyright" class="container">
			Design: <a href="http://templated.co">TEMPLATED</a> Images: <a href="http://unsplash.com">Unsplash</a> (<a href="http://unsplash.com/cc0">CC0</a>)
		</div>


	</body>
</html>