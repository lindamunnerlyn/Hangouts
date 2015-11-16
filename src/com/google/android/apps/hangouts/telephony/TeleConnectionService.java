// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony;

import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;
import android.telecom.RemoteConference;
import dtr;
import dtz;
import due;
import duu;
import duv;
import dvh;
import dvj;
import dvk;
import dvv;
import dvx;
import dwz;
import dxf;
import ebw;
import g;
import hgx;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class TeleConnectionService extends ConnectionService
{

    private final dxf a = new dxf(this);

    public TeleConnectionService()
    {
    }

    public dxf a()
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
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 63 + String.valueOf(s1).length())).append("TeleConnectionService.onConference, connection1: ").append(s).append(" connection2: ").append(s1).toString());
        if ((connection instanceof dtz) && (connection1 instanceof dtz))
        {
            connection = (dtz)connection;
            if (connection.j() != null)
            {
                connection1 = (dtz)connection1;
                connection.j().a(connection1.j());
            }
        }
    }

    public void onCreate()
    {
        if (g.a(this, "babel_make_foreground_service", false))
        {
            ebw.e("Babel_telephony", "TeleConnectionService.onCreate, making this a foreground service.");
            startForeground(1, (new android.app.Notification.Builder(this)).setContentTitle(getText(g.pD)).setContentText(getText(g.pD)).setSmallIcon(g.pe).setAutoCancel(false).setLocalOnly(true).setOngoing(true).build());
        }
    }

    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneaccounthandle, ConnectionRequest connectionrequest)
    {
        phoneaccounthandle = String.valueOf(connectionrequest);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(phoneaccounthandle).length() + 59)).append("TeleConnectionService.onCreateIncomingConnection, request: ").append(phoneaccounthandle).toString());
        int i = dwz.a(this).b();
        duv duv1;
        if (i != -1)
        {
            phoneaccounthandle = new due(this, i);
        } else
        {
            phoneaccounthandle = null;
        }
        duv1 = (duv)hgx.a(this, duv);
        if (duv.a(connectionrequest))
        {
            return duv1.a(this, connectionrequest, phoneaccounthandle);
        } else
        {
            return (new duu(this, this, connectionrequest, phoneaccounthandle)).a();
        }
    }

    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneaccounthandle, ConnectionRequest connectionrequest)
    {
        phoneaccounthandle = String.valueOf(connectionrequest);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(phoneaccounthandle).length() + 59)).append("TeleConnectionService.onCreateOutgoingConnection, request: ").append(phoneaccounthandle).toString());
        phoneaccounthandle = getApplicationContext();
        connectionrequest = new dtz(new dvk(this, connectionrequest, new dvh(this, dvx.a(this)), false));
        (new dvj(phoneaccounthandle, connectionrequest)).a();
        return connectionrequest;
    }

    public void onRemoteConferenceAdded(RemoteConference remoteconference)
    {
        String s = String.valueOf(remoteconference);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 59)).append("TeleConnectionService.onRemoteConferenceAdded, conference: ").append(s).toString());
        addConference(dvv.a(remoteconference, this));
    }
}
