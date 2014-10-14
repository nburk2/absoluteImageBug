/**
 * Created by nburk on 10/14/14.
 */
class badUrlService {

    def groovyPageRenderer

    def generateHtmlBody(){
        groovyPageRenderer.render(template:'/test/badImageUrl')
    }
}
