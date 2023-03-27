package controllers

import javax.inject._
import play.api._
import play.api.mvc._

//case class ContactFormData(name: String, email: String, message: String)
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  // val contactForm = Form(
  // mapping(
  //   "name" -> nonEmptyText,
  //   "email" -> email,
  //   "message" -> nonEmptyText
  // )(ContactFormData.apply)(ContactFormData.unapply))

  // val formData = contactForm.bindFromRequest()
  // formData.fold(
  // formWithErrors => {
  //   Ok(views.html.home())
  // },
  // contactFormData => {
  // })

  def home() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.home())
  }
  def projects() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.projects())
  }

  def experience() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.experience())
  }  

  def achievements() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.achievements())
  }

  def contact() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.contact())
  }

  
}
