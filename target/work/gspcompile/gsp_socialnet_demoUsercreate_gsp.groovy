import socnet.DemoUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_demoUsercreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/demoUser/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'demoUser.label', default: 'DemoUser'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',13,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("list")],2)
printHtmlPart(7)
invokeTag('message','g',17,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('renderErrors','g',23,['bean':(demoUserInstance),'as':("list")],-1)
printHtmlPart(13)
})
invokeTag('hasErrors','g',25,['bean':(demoUserInstance)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',33,['code':("demoUser.bio.label"),'default':("Bio")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: demoUserInstance, field: 'bio', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',36,['name':("bio"),'value':(demoUserInstance?.bio)],-1)
printHtmlPart(17)
invokeTag('message','g',42,['code':("demoUser.country.label"),'default':("Country")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: demoUserInstance, field: 'country', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',45,['name':("country"),'value':(demoUserInstance?.country)],-1)
printHtmlPart(18)
invokeTag('message','g',51,['code':("demoUser.likes.label"),'default':("Likes")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: demoUserInstance, field: 'likes', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',54,['name':("likes"),'value':(demoUserInstance?.likes)],-1)
printHtmlPart(19)
invokeTag('message','g',60,['code':("demoUser.name.label"),'default':("Name")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: demoUserInstance, field: 'name', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',63,['name':("name"),'value':(demoUserInstance?.name)],-1)
printHtmlPart(20)
invokeTag('message','g',69,['code':("demoUser.needs.label"),'default':("Needs")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: demoUserInstance, field: 'needs', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',72,['name':("needs"),'value':(demoUserInstance?.needs)],-1)
printHtmlPart(21)
invokeTag('message','g',78,['code':("demoUser.state.label"),'default':("State")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: demoUserInstance, field: 'state', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',81,['name':("state"),'value':(demoUserInstance?.state)],-1)
printHtmlPart(22)
invokeTag('message','g',87,['code':("demoUser.town.label"),'default':("Town")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: demoUserInstance, field: 'town', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',90,['name':("town"),'value':(demoUserInstance?.town)],-1)
printHtmlPart(23)
invokeTag('submitButton','g',98,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(24)
})
invokeTag('form','g',100,['action':("save")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',102,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1315140656000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
