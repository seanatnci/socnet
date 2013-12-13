import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_accountcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/create.gsp" }
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
invokeTag('link','g',10,['class':("list"),'action':("list")],2)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('renderErrors','g',20,['bean':(person),'as':("list")],-1)
printHtmlPart(12)
})
invokeTag('hasErrors','g',22,['bean':(person)],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(13)
expressionOut.print(hasErrors(bean:person,field:'username','errors'))
printHtmlPart(14)
expressionOut.print(person.username?.encodeAsHTML())
printHtmlPart(15)
expressionOut.print(hasErrors(bean:person,field:'userRealName','errors'))
printHtmlPart(16)
expressionOut.print(person.userRealName?.encodeAsHTML())
printHtmlPart(17)
expressionOut.print(hasErrors(bean:person,field:'passwd','errors'))
printHtmlPart(18)
expressionOut.print(person.passwd?.encodeAsHTML())
printHtmlPart(19)
expressionOut.print(hasErrors(bean:person,field:'enabled','errors'))
printHtmlPart(20)
invokeTag('checkBox','g',52,['name':("enabled"),'value':(person.enabled)],-1)
printHtmlPart(21)
expressionOut.print(hasErrors(bean:person,field:'description','errors'))
printHtmlPart(22)
expressionOut.print(person.description?.encodeAsHTML())
printHtmlPart(23)
expressionOut.print(hasErrors(bean:person,field:'email','errors'))
printHtmlPart(24)
expressionOut.print(person.email?.encodeAsHTML())
printHtmlPart(25)
expressionOut.print(hasErrors(bean:person,field:'emailShow','errors'))
printHtmlPart(20)
invokeTag('checkBox','g',73,['name':("emailShow"),'value':(person.emailShow)],-1)
printHtmlPart(26)
for( _it5990503 in (authorityList) ) {
changeItVariable(_it5990503)
printHtmlPart(27)
expressionOut.print(it.authority.encodeAsHTML())
printHtmlPart(28)
invokeTag('checkBox','g',84,['name':(it.authority)],-1)
printHtmlPart(29)
}
printHtmlPart(30)
})
invokeTag('form','g',96,['action':("save")],2)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',99,[:],1)
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
