// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class cvt extends hiz
{

    private static final boolean a = false;
    public static final String c;
    private cxr b;
    public final hih d;
    final dmf e;

    protected cvt(hio hio1, dmf dmf, String s, dmi dmi1, kws kws, kws kws1)
    {
        super(g.nU, hio1, s, kws, kws1, dmi1.toString(), c);
        e = dmf;
        d = super.h.f();
    }

    protected abstract cxr a(kws kws);

    protected jdk a(ctw ctw1)
    {
        jdk jdk1 = cvu.a(ctw1.a(), ctw1.b(), ctw1.c(), ctw1.d(), (efu)hlp.a(g, efu));
        jdk jdk = jdk1;
        if (ctw1.f())
        {
            jdk = cvu.a(jdk1, ctw1.e());
        }
        return jdk;
    }

    public final void a(ByteBuffer bytebuffer, String s)
    {
        super.a(bytebuffer, s);
        throw dcx.a(super.k, super.m, super.l);
    }

    protected void b(kws kws)
    {
        if (a)
        {
            kws = String.valueOf(kws);
            eev.b("Babel_ServerOperation", (new StringBuilder(String.valueOf(kws).length() + 17)).append("Sending request: ").append(kws).toString());
        }
    }

    public Bundle c()
    {
        Bundle bundle = new Bundle();
        bundle.putString("alt", "proto");
        return bundle;
    }

    protected final void c(kws kws)
    {
        cxr cxr1 = a(kws);
        if (cxr1 == null || cxr1.a() == null)
        {
            throw new IOException("Resonse error: NULL_RESPONSE");
        }
        int i = cxr1.a().b;
        if (i != 1)
        {
            kws = String.valueOf(e);
            String s = cxr1.a().a;
            String s2 = cxr1.a().c;
            eev.g("Babel_ServerOperation", (new StringBuilder(String.valueOf(kws).length() + 61 + String.valueOf(s).length() + String.valueOf(s2).length())).append("Request sent ").append(kws).append(" got responseStatus ").append(i).append(" desc ").append(s).append(" debug_url ").append(s2).toString());
        } else
        if (a)
        {
            String s1 = String.valueOf(e);
            kws = String.valueOf(kws);
            eev.b("Babel_ServerOperation", (new StringBuilder(String.valueOf(s1).length() + 41 + String.valueOf(kws).length())).append("client request sent ").append(s1).append(" got client response ").append(kws).toString());
        }
        switch (i)
        {
        default:
            if (cxr1.c != null)
            {
                kws = cxr1.c.c;
            } else
            {
                kws = "(null)";
            }
            eev.g("Babel_ServerOperation", (new StringBuilder(String.valueOf(kws).length() + 71)).append("got unknown ResponseStatus in response header ").append(i).append("; debugUrl is ").append(kws).toString());
            throw new dcx(108, "Resonse error: ERROR_UNEXPECTED");

        case 2: // '\002'
            throw new dcx(107, "Response error: ERROR_BUSY");

        case 3: // '\003'
            throw new dcx(108, "Response error: ERROR_UNEXPECTED");

        case 4: // '\004'
            throw new dcx(111, "Response error: ERROR_INVALID_REQUEST");

        case 5: // '\005'
            throw new dcx(109, "Response error: ERROR_RETRY_LIMIT");

        case 7: // '\007'
            throw new dcx(112, "Response error: ERROR_QUOTA_EXCEEDED");

        case 8: // '\b'
            throw new dcx(113, "Response error: ERROR_RESPONSE_NOT_FOUND");

        case 1: // '\001'
        case 6: // '\006'
        case 9: // '\t'
            cxr1.a(e);
            break;
        }
        if (d != null)
        {
            cxr1.a(d.f() * 1000L);
            cxr1.b(d.h() * 1000L);
        }
        b = cxr1;
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
        g.d(flag, s);
    }

    public cxr e()
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
        catch (dcx dcx1)
        {
            throw dcx1;
        }
        catch (IOException ioexception)
        {
            throw new dcx(106, ioexception);
        }
    }

    static 
    {
        Object obj = eev.k;
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
