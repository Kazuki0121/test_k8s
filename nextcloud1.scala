
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class nextcloud1 extends Simulation {

	val httpProtocol = http
		.baseUrl("http://20.210.59.172:8080")
		.disableFollowRedirect
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("ja,en-US;q=0.9,en;q=0.8,ko;q=0.7,pt;q=0.6,zh-CN;q=0.5,zh;q=0.4")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"Content-Type" -> "application/xml; charset=UTF-8",
		"Depth" -> "0",
		"Origin" -> "http://20.210.59.172:8080",
		"Proxy-Connection" -> "keep-alive",
		"X-NC-CalDAV-Webcal-Caching" -> "On",
		"X-Requested-With" -> "XMLHttpRequest",
		"requesttoken" -> "8TpuU52DAkHteC0mS+ITVRyFWTQylY8W0pUGmyGMAIc=:iwoGaqnFcwi5Nx9He4glH3LQNWNa+sJCt9xp1nL9de8=")

	val headers_2 = Map(
		"Content-Type" -> "application/xml; charset=UTF-8",
		"Depth" -> "1",
		"Origin" -> "http://20.210.59.172:8080",
		"Proxy-Connection" -> "keep-alive",
		"X-NC-CalDAV-Webcal-Caching" -> "On",
		"X-Requested-With" -> "XMLHttpRequest",
		"requesttoken" -> "8TpuU52DAkHteC0mS+ITVRyFWTQylY8W0pUGmyGMAIc=:iwoGaqnFcwi5Nx9He4glH3LQNWNa+sJCt9xp1nL9de8=")

	val headers_6 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> """"35dba5d75538a9bbe0b4da4422759a0e"""",
		"Proxy-Connection" -> "keep-alive",
		"requesttoken" -> "8TpuU52DAkHteC0mS+ITVRyFWTQylY8W0pUGmyGMAIc=:iwoGaqnFcwi5Nx9He4glH3LQNWNa+sJCt9xp1nL9de8=")

	val headers_7 = Map(
		"Content-Type" -> "text/calendar; charset=UTF-8",
		"Depth" -> "0",
		"Origin" -> "http://20.210.59.172:8080",
		"Proxy-Connection" -> "keep-alive",
		"X-NC-CalDAV-Webcal-Caching" -> "On",
		"X-Requested-With" -> "XMLHttpRequest",
		"requesttoken" -> "8TpuU52DAkHteC0mS+ITVRyFWTQylY8W0pUGmyGMAIc=:iwoGaqnFcwi5Nx9He4glH3LQNWNa+sJCt9xp1nL9de8=")

	val headers_9 = Map(
		"Cache-Control" -> "max-age=0",
		"Content-Type" -> "text/calendar; charset=UTF-8; component=vevent; charset=UTF-8",
		"Depth" -> "0",
		"If-Match" -> """"2e300c7de1a17896c962a23e981bc71c"""",
		"Origin" -> "http://20.210.59.172:8080",
		"Proxy-Connection" -> "keep-alive",
		"X-NC-CalDAV-Webcal-Caching" -> "On",
		"X-Requested-With" -> "XMLHttpRequest",
		"requesttoken" -> "8TpuU52DAkHteC0mS+ITVRyFWTQylY8W0pUGmyGMAIc=:iwoGaqnFcwi5Nx9He4glH3LQNWNa+sJCt9xp1nL9de8=")



	val scn = scenario("nextcloud1")
		.exec(http("request_0:MKCOL_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal")
			.httpRequest("MKCOL", "/remote.php/dav/calendars/admin/newcal")
			.headers(headers_0)
			.body(RawFileBody("nextcloud1/0000_request.xml")))
		.exec(http("request_1:PROPFIND_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal/")
			.httpRequest("PROPFIND", "/remote.php/dav/calendars/admin/newcal/")
			.headers(headers_0)
			.body(RawFileBody("nextcloud1/0001_request.xml"))
			.check(bodyBytes.is(RawFileBody("nextcloud1/0001_response.xml"))))
		.exec(http("request_2:REPORT_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal/")
			.httpRequest("REPORT", "/remote.php/dav/calendars/admin/newcal/")
			.headers(headers_2)
			.body(RawFileBody("nextcloud1/0002_request.xml"))
			.check(bodyBytes.is(RawFileBody("nextcloud1/0002_response.xml"))))
		.exec(http("request_3:REPORT_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal/")
			.httpRequest("REPORT", "/remote.php/dav/calendars/admin/newcal/")
			.headers(headers_2)
			.body(RawFileBody("nextcloud1/0003_request.xml"))
			.check(bodyBytes.is(RawFileBody("nextcloud1/0003_response.xml"))))
		.pause(3)
		.exec(http("request_4:PROPPATCH_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal/")
			.httpRequest("PROPPATCH", "/remote.php/dav/calendars/admin/newcal/")
			.headers(headers_0)
			.body(RawFileBody("nextcloud1/0004_request.xml"))
			.check(bodyBytes.is(RawFileBody("nextcloud1/0004_response.xml"))))
		.exec(http("request_5:PROPPATCH_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal/")
			.httpRequest("PROPPATCH", "/remote.php/dav/calendars/admin/newcal/")
			.headers(headers_0)
			.body(RawFileBody("nextcloud1/0005_request.xml"))
			.check(bodyBytes.is(RawFileBody("nextcloud1/0005_response.xml"))))
		.pause(15)
		.exec(http("request_6:GET_http://20.210.59.172:8080/ocs/v2.php/apps/notifications/api/v2/notifications")
			.get("/ocs/v2.php/apps/notifications/api/v2/notifications")
			.headers(headers_6))
		.pause(1)
		.exec(http("request_7:PUT_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal/B7C9629F-05CB-4C69-9535-8E31AD8E48BB.ics")
			.put("/remote.php/dav/calendars/admin/newcal/B7C9629F-05CB-4C69-9535-8E31AD8E48BB.ics")
			.headers(headers_7)
			.body(RawFileBody("nextcloud1/0007_request.ics")))
		.exec(http("request_8:PROPFIND_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal/B7C9629F-05CB-4C69-9535-8E31AD8E48BB.ics")
			.httpRequest("PROPFIND", "/remote.php/dav/calendars/admin/newcal/B7C9629F-05CB-4C69-9535-8E31AD8E48BB.ics")
			.headers(headers_0)
			.body(RawFileBody("nextcloud1/0008_request.xml"))
			.check(bodyBytes.is(RawFileBody("nextcloud1/0008_response.xml"))))
		.pause(6)
		.exec(http("request_9:PUT_http://20.210.59.172:8080/remote.php/dav/calendars/admin/newcal/B7C9629F-05CB-4C69-9535-8E31AD8E48BB.ics")
			.put("/remote.php/dav/calendars/admin/newcal/B7C9629F-05CB-4C69-9535-8E31AD8E48BB.ics")
			.headers(headers_9)
			.body(RawFileBody("nextcloud1/0009_request.ics")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}