import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_accountlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',2,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(1, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',4,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLinkTo(dir:''))
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',10,['class':("create"),'action':("create")],2)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('sortableColumn','g',22,['property':("id"),'title':("Id")],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',23,['property':("username"),'title':("Login Name")],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',24,['property':("userRealName"),'title':("Full Name")],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',25,['property':("enabled"),'title':("Enabled")],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',26,['property':("description"),'title':("Description")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( person in (personList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(14)
expressionOut.print(person.id)
printHtmlPart(15)
expressionOut.print(person.username?.encodeAsHTML())
printHtmlPart(15)
expressionOut.print(person.userRealName?.encodeAsHTML())
printHtmlPart(15)
expressionOut.print(person.enabled?.encodeAsHTML())
printHtmlPart(15)
expressionOut.print(person.description?.encodeAsHTML())
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',40,['action':("show"),'id':(person.id)],3)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',50,['total':(Account.count())],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',54,[:],1)
printHtmlPart(2)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1314618020000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
