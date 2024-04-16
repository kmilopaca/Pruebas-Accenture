package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component

public class SymphonyActionExecutionStep {
    @Autowired
    private StepPages page;

    public void MenuActionExecution() {
        page.symActionExecution().MenuActionExecution(); }

    public void CreateActionExecution() {
        page.symActionExecution().CreateAction(); }

    public void NameyDescription(String arg0, String arg1) {
        page.symActionExecution().NameAndDescription(arg0, arg1); }

    public void FilteringResource() {
        page.symActionExecution().FilterResource(); }

    public void SelectRolSpaces(String arg0) {
        page.symActionExecution().SelectRolSpaces(arg0); }

    public void SelectRolbackAction() {
        page.symActionExecution().SelectRolback(); }
    public void SelectListAction() {
        page.symActionExecution().SelectListDespegable(); }

    public void SelectActionScheduled() {
        page.symActionExecution().SelectAction(); }

    public void SelectAllAction() {
        page.symActionExecution().SelectAll(); }

    public void SelectNextAction() {
        page.symActionExecution().SelectNetx(); }

    public void ScheduledAction() {
        page.symActionExecution().ScheduledAction(); }


}
