package absoluteimagebug

class TestController {

    def badUrlService

    def index() { }

    def goodUrl(){
        String htmlBody = g.render(template:'goodImageUrl')
        render view:'goodUrl', model:[html:htmlBody]

    }

    def badUrl(){
        String htmlBody = badUrlService.generateHtmlBody()
        render view:'badUrl', model:[html:htmlBody]
    }
}
