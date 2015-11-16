// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class ctp extends hei
{

    private static final boolean a = false;
    public static final String c;
    private cvn b;
    public final hdq d;
    final dko e;

    protected ctp(hdx hdx1, dko dko, String s, String s1, kop kop, kop kop1)
    {
        super(g.nS, hdx1, s, kop, kop1, s1, c);
        e = dko;
        d = super.h.f();
    }

    protected abstract cvn a(kop kop);

    protected ixf a(crt crt1)
    {
        ixf ixf1 = ctq.a(crt1.a(), crt1.b(), crt1.c(), crt1.d(), (ecs)hgx.a(g, ecs));
        ixf ixf = ixf1;
        if (crt1.f())
        {
            ixf = ctq.a(ixf1, crt1.e());
        }
        return ixf;
    }

    public final void a(ByteBuffer bytebuffer, String s)
    {
        super.a(bytebuffer, s);
        throw dbo.a(super.k, super.m, super.l);
    }

    protected void b(kop kop)
    {
        if (a)
        {
            kop = String.valueOf(kop);
            ebw.b("Babel_ServerOperation", (new StringBuilder(String.valueOf(kop).length() + 17)).append("Sending request: ").append(kop).toString());
        }
    }

    public Bundle c()
    {
        Bundle bundle = new Bundle();
        bundle.putString("alt", "proto");
        return bundle;
    }

    protected final void c(kop kop)
    {
        cvn cvn1 = a(kop);
        if (cvn1 == null || cvn1.a() == null)
        {
            throw new IOException("Resonse error: NULL_RESPONSE");
        }
        int i = cvn1.a().b;
        if (i != 1)
        {
            kop = String.valueOf(e);
            String s = cvn1.a().a;
            String s2 = cvn1.a().c;
            ebw.g("Babel_ServerOperation", (new StringBuilder(String.valueOf(kop).length() + 61 + String.valueOf(s).length() + String.valueOf(s2).length())).append("Request sent ").append(kop).append(" got responseStatus ").append(i).append(" desc ").append(s).append(" debug_url ").append(s2).toString());
        } else
        if (a)
        {
            String s1 = String.valueOf(e);
            kop = String.valueOf(kop);
            ebw.b("Babel_ServerOperation", (new StringBuilder(String.valueOf(s1).length() + 41 + String.valueOf(kop).length())).append("client request sent ").append(s1).append(" got client response ").append(kop).toString());
        }
        switch (i)
        {
        default:
            if (b.c != null)
            {
                kop = b.c.c;
            } else
            {
                kop = "(null)";
            }
            ebw.g("Babel_ServerOperation", (new StringBuilder(String.valueOf(kop).length() + 71)).append("got unknown ResponseStatus in response header ").append(i).append("; debugUrl is ").append(kop).toString());
            throw new dbo(108, "Resonse error: ERROR_UNEXPECTED");

        case 2: // '\002'
            throw new dbo(107, "Response error: ERROR_BUSY");

        case 3: // '\003'
            throw new dbo(108, "Response error: ERROR_UNEXPECTED");

        case 4: // '\004'
            throw new dbo(111, "Response error: ERROR_INVALID_REQUEST");

        case 5: // '\005'
            throw new dbo(109, "Response error: ERROR_RETRY_LIMIT");

        case 7: // '\007'
            throw new dbo(112, "Response error: ERROR_QUOTA_EXCEEDED");

        case 8: // '\b'
            throw new dbo(113, "Response error: ERROR_RESPONSE_NOT_FOUND");

        case 1: // '\001'
        case 6: // '\006'
        case 9: // '\t'
            cvn1.a(e);
            break;
        }
        if (d != null)
        {
            cvn1.a(d.f() * 1000L);
            cvn1.b(d.h() * 1000L);
        }
        b = cvn1;
    }

    protected void d()
    {
        String s;
        boolean flag;
        if (!"SMS".equals(super.h.b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = String.valueOf(j());
        if (s.length() != 0)
        {
            s = "Cannot send request for SMS only account: ".concat(s);
        } else
        {
            s = new String("Cannot send request for SMS only account: ");
        }
        g.b(flag, s);
    }

    public cvn e()
    {
        return b;
    }

    public void f()
    {
        g();
        try
        {
            b("Babel_ServerOperation");
            return;
        }
        catch (dbo dbo1)
        {
            throw dbo1;
        }
        catch (IOException ioexception)
        {
            throw new dbo(106, ioexception);
        }
    }

    static 
    {
        Object obj = ebw.k;
        obj = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation  https://www.googleapis.com/auth/chat.native";
        try
        {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            classnotfoundexception = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation ";
        }
        c = ((String) (obj));
    }
}
