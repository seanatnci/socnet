import socnet.LoginUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_loginUserlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/loginUser/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'loginUser.label', default: 'LoginUser'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',16,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',25,['property':("id"),'title':(message(code: 'loginUser.id.label', default: 'Id'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("login"),'title':(message(code: 'loginUser.login.label', default: 'Login'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',29,['property':("password"),'title':(message(code: 'loginUser.password.label', default: 'Password'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( loginUserInstance in (loginUserInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: loginUserInstance, field: "id"))
})
invokeTag('link','g',37,['action':("show"),'id':(loginUserInstance.id)],3)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: loginUserInstance, field: "login"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: loginUserInstance, field: "password"))
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',49,['total':(loginUserInstanceTotal)],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',52,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1314635652000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
