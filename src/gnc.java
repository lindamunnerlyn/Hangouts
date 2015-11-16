// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class gnc
    implements enb, end
{

    final gnb a;
    private final emy b;
    private final ell c;
    private final lcj d;

    gnc(gnb gnb1)
    {
        a = gnb1;
        super();
        Object obj = gnb1.b.d().a();
        emz emz1 = (new emz(gnb1.a)).a(ell.c);
        byte byte0;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((gmn) (obj)).n();
        }
        b = emz1.a(((String) (obj))).a(this).a();
        b.b();
        c = gnb1.a();
        gnb1 = gnb1.a;
        obj = new lcj();
        obj.b = Integer.valueOf(407);
        obj.c = Integer.valueOf(2);
        if (g.L(gnb1))
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        obj.a = Integer.valueOf(byte0);
        d = ((lcj) (obj));
    }

    void a()
    {
        c.a(b);
    }

    public void a(int i)
    {
        gne.a("vclib", "ImpressionReporter GoogleApiClient suspended: %d.", new Object[] {
            Integer.valueOf(i)
        });
    }

    public void a(ConnectionResult connectionresult)
    {
        gne.c("vclib", "ImpressionReporter GoogleApiClient failed: %s", new Object[] {
            connectionresult
        });
    }

    public void a_(Bundle bundle)
    {
        gne.a(4, "vclib", "ImpressionReporter connected to GoogleApiClient.");
    }

    void b(int i)
    {
        jlt jlt1;
        gmq gmq1;
        gmn gmn1;
        gms gms1;
        jlt1 = new jlt();
        jlt1.e = d;
        jlt1.a = new jll();
        jlt1.a.j = new jlm();
        jlt1.a.j.a = Integer.valueOf(i);
        gmq1 = a.b.d();
        gmn1 = gmq1.a();
        gms1 = gmq1.b();
        jlt1.a.a = new jlk();
        if (gms1 == null) goto _L2; else goto _L1
_L1:
        jlt1.a.a.c = gms1.a();
        jlt1.a.a.d = gms1.b();
_L4:
        if (gmn1 != null)
        {
            jlt1.a.a.a = gmn1.p();
        }
        jlt1.a.a.k = gmq1.c();
        jlt1.a.a.b = gmq1.d();
        jlt1.a.a.e = gmq1.e();
        c.a(kws.toByteArray(jlt1)).b(b);
        gne.a(3, "vclib", "Logging to clearcut: \n%s", new Object[] {
            jlt1
        });
        return;
_L2:
        if (gmn1 != null)
        {
            jlt1.a.a.c = gmn1.f();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
