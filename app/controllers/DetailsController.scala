package controllers

import Module.DatabaseAccess

import javax.inject._
import play.api.mvc._

class DetailsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
    def GetDetails = Action{
        val userDetailTable = DatabaseAccess.userResult()
        Ok(views.html.userDetails(userDetailTable))
    }
}
