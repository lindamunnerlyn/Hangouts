// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony;

import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;
import android.telecom.RemoteConference;
import dwz;
import dxh;
import dxm;
import dyc;
import dyd;
import dyg;
import dyq;
import dys;
import dyt;
import dze;
import dzg;
import eaj;
import eap;
import eev;
import g;
import hlp;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class TeleConnectionService extends ConnectionService
{

    private final eap a = new eap(this);

    public TeleConnectionService()
    {
    }

    public eap a()
    {
        return a;
    }

    protected void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a.a(printwriter);
    }

    public void onConference(Connection connection, Connection connection1)
    {
        String s = String.valueOf(connection);
        String s1 = String.valueOf(connection1);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 63 + String.valueOf(s1).length())).append("TeleConnectionService.onConference, connection1: ").append(s).append(" connection2: ").append(s1).toString());
        if ((connection instanceof dxh) && (connection1 instanceof dxh))
        {
            connection = (dxh)connection;
            if (connection.j() != null)
            {
                connection1 = (dxh)connection1;
                connection.j().a(connection1.j());
            }
        }
    }

    public void onCreate()
    {
        if (g.a(this, "babel_make_foreground_service", false))
        {
            eev.e("Babel_telephony", "TeleConnectionService.onCreate, making this a foreground service.");
            startForeground(1, (new android.app.Notification.Builder(this)).setContentTitle(getText(g.pF)).setContentText(getText(g.pF)).setSmallIcon(g.pg).setAutoCancel(false).setLocalOnly(true).setOngoing(true).build());
        }
    }

    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneaccounthandle, ConnectionRequest connectionrequest)
    {
        phoneaccounthandle = String.valueOf(connectionrequest);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(phoneaccounthandle).length() + 59)).append("TeleConnectionService.onCreateIncomingConnection, request: ").append(phoneaccounthandle).toString());
        int i = eaj.a(this).b();
        dyd dyd1;
        boolean flag;
        if (i != -1)
        {
            phoneaccounthandle = new dxm(this, i);
        } else
        {
            phoneaccounthandle = null;
        }
        dyd1 = (dyd)hlp.a(this, dyd);
        if (dyg.a(connectionrequest.getExtras()) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return dyd1.a(this, connectionrequest, phoneaccounthandle);
        } else
        {
            return (new dyc(this, this, connectionrequest, phoneaccounthandle)).a();
        }
    }

    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneaccounthandle, ConnectionRequest connectionrequest)
    {
        phoneaccounthandle = String.valueOf(connectionrequest);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(phoneaccounthandle).length() + 59)).append("TeleConnectionService.onCreateOutgoingConnection, request: ").append(phoneaccounthandle).toString());
        phoneaccounthandle = getApplicationContext();
        connectionrequest = new dxh(new dyt(this, connectionrequest, new dyq(this, dzg.a(this)), false));
        (new dys(phoneaccounthandle, connectionrequest)).a();
        return connectionrequest;
    }

    public void onRemoteConferenceAdded(RemoteConference remoteconference)
    {
        String s = String.valueOf(remoteconference);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 59)).append("TeleConnectionService.onRemoteConferenceAdded, conference: ").append(s).toString());
        addConference(dze.a(remoteconference, this));
    }
}
