' FamilyUserVB.vb
Imports System.IO
Imports System
Public Class FamilyUser
    Private u_id As String
    Private u_name As String
    Private u_pwd As String
    Public Sub input(ByVal i As String, ByVal n As String, ByVal p As String)
        u_id = i
        u_name = n
        u_pwd = p
    End Sub
    Public Function output() As String
        Dim str As String
        str = "u_id=" + u_id + Space(8) +
                 "u_name=" + u_name + Space(8) +
                 "u_pwd=" + u_pwd + Chr(13) + Chr(10)
        Return str
    End Function
End Class
Module FamilyUserVB
    Sub Main()
        Dim fu1 As New FamilyUser()
        fu1.input("01", "admin", "123456")
        Console.Write(fu1.output())

        Dim fu2 As New FamilyUser()
        fu2.input("02", "peter", "654321")
        Console.Write(fu2.output())
    End Sub
End Module
