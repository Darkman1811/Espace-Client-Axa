/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spi;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

/**
 *
 * @author darkman
 */
@WebService(serviceName = "ProcessMakerService", portName = "ProcessMakerServiceSoap", endpointInterface = "com.processmaker.ProcessMakerServiceSoap", targetNamespace = "http://www.processmaker.com", wsdlLocation = "META-INF/wsdl/Processmaker/localhost_38232/ProcessMakerService/processmaker.wsdl")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
@Stateless
public class Processmaker {

    public void login(java.lang.String userid, java.lang.String password, javax.xml.ws.Holder<java.math.BigInteger> statusCode, javax.xml.ws.Holder<java.lang.String> message, javax.xml.ws.Holder<java.lang.String> version, javax.xml.ws.Holder<java.lang.String> timestamp) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.ProcessListResponse processList(com.processmaker.ProcessListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.RoleListResponse roleList(com.processmaker.RoleListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.GroupListResponse groupList(com.processmaker.GroupListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.DepartmentListResponse departmentList(com.processmaker.DepartmentListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.UserListResponse userList(com.processmaker.UserListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.CaseListResponse caseList(com.processmaker.CaseListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.UnassignedCaseListResponse unassignedCaseList(com.processmaker.UnassignedCaseListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.CreateUserResponse createUser(com.processmaker.CreateUserRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.UpdateUserResponse updateUser(com.processmaker.UpdateUserRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.InformationUserResponse informationUser(com.processmaker.InformationUserRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.CreateGroupResponse createGroup(com.processmaker.CreateGroupRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.CreateDepartmentResponse createDepartment(com.processmaker.CreateDepartmentRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.PmResponse assignUserToGroup(com.processmaker.AssignUserToGroupRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.PmResponse assignUserToDepartment(com.processmaker.AssignUserToDepartmentRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.NewCaseResponse newCase(com.processmaker.NewCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.PmResponse reassignCase(com.processmaker.ReassignCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.NewCaseImpersonateResponse newCaseImpersonate(com.processmaker.NewCaseImpersonateRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.RouteCaseResponse routeCase(com.processmaker.RouteCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.PmResponse executeTrigger(com.processmaker.ExecuteTriggerRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.PmResponse sendVariables(com.processmaker.SendVariablesRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.GetVariablesResponse getVariables(com.processmaker.GetVariablesRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.GetVariablesNamesResponse getVariablesNames(com.processmaker.GetVariablesNamesRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.PmResponse sendMessage(com.processmaker.SendMessageRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.GetCaseInfoResponse getCaseInfo(com.processmaker.GetCaseInfoRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.TaskListResponse taskList(com.processmaker.TaskListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.TaskCaseResponse taskCase(com.processmaker.TaskCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.SystemInformationResponse systemInformation(com.processmaker.SystemInformationRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.TriggerListResponse triggerList(com.processmaker.TriggerListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.OutputDocumentListResponse outputDocumentList(com.processmaker.OutputDocumentListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.InputDocumentListResponse inputDocumentList(com.processmaker.InputDocumentListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.InputDocumentProcessListResponse inputDocumentProcessList(com.processmaker.InputDocumentProcessListRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.RemoveDocumentResponse removeDocument(com.processmaker.RemoveDocumentRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.GetCaseNotesResponse getCaseNotes(com.processmaker.GetCaseNotesRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.PmResponse removeUserFromGroup(com.processmaker.RemoveUserFromGroupRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.DeleteCaseResponse deleteCase(com.processmaker.DeleteCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.CancelCaseResponse cancelCase(com.processmaker.CancelCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.PauseCaseResponse pauseCase(com.processmaker.PauseCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.UnpauseCaseResponse unpauseCase(com.processmaker.UnpauseCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.AddCaseNoteResponse addCaseNote(com.processmaker.AddCaseNoteRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.processmaker.ClaimCaseResponse claimCase(com.processmaker.ClaimCaseRequest parameters) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
