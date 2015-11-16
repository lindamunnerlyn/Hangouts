// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dbh
{

    public int a;
    private final ani b;
    private final dbh c;
    private final dbn d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public dbh(ani ani1, dbh dbh1)
    {
        a = 100;
        e = false;
        f = false;
        g = false;
        h = false;
        b = ani1;
        d = new dbn(b);
        c = dbh1;
    }

    static void a(dbh dbh1)
    {
        dbh1;
        JVM INSTR monitorenter ;
        if (dbh1.b() || dbh1.b.e())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        dbh1;
        JVM INSTR monitorexit ;
        return;
        if (!dbh1.b.q())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        dbh1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        dbh1;
        JVM INSTR monitorexit ;
        throw exception;
        long l1;
        long l2;
        l1 = ank.n(g.nS, dbh1.b);
        l2 = System.currentTimeMillis();
        if (l1 - l2 > 0x5265c00L) goto _L2; else goto _L1
_L1:
        if (l2 - l1 <= dbf.b()) goto _L3; else goto _L2
_L2:
        if (!ebw.a("Babel", 3)) goto _L5; else goto _L4
_L4:
        String s1;
        s1 = String.valueOf(dbh1.a());
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s1 = "Renewing account setting:".concat(s1);
_L7:
        ebw.c("Babel", s1);
_L5:
        RealTimeChatService.a(dbh1.b);
_L3:
        dbh1;
        JVM INSTR monitorexit ;
        return;
        s1 = new String("Renewing account setting:");
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void b(dbh dbh1)
    {
        dbh1;
        JVM INSTR monitorenter ;
        if (dbh1.b.e())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        String s1 = dbh1.a();
        ebw.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 61)).append("Account ").append(s1).append(" not valid for babel. Skip device registration renew.").toString());
        dbh1;
        JVM INSTR monitorexit ;
        return;
        if (dbh1.k() && !dbh1.g)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        dbh1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        dbh1;
        JVM INSTR monitorexit ;
        throw exception;
        long l1;
        long l2;
        l1 = ank.i(g.nS, dbh1.b);
        l2 = System.currentTimeMillis();
        if (l1 - l2 > 0x5265c00L) goto _L2; else goto _L1
_L1:
        if (l2 - l1 <= dbf.a()) goto _L3; else goto _L2
_L2:
        if (!dcx.c().d()) goto _L3; else goto _L4
_L4:
        if (!ebw.a("Babel", 3)) goto _L6; else goto _L5
_L5:
        String s2;
        s2 = String.valueOf(dbh1.a());
        if (s2.length() == 0)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        s2 = "Renewing account registration:".concat(s2);
_L8:
        ebw.c("Babel", s2);
_L6:
        RealTimeChatService.a(dbh1.b, true);
        dbh1.g = true;
_L3:
        dbh1;
        JVM INSTR monitorexit ;
        return;
        s2 = new String("Renewing account registration:");
        if (true) goto _L8; else goto _L7
_L7:
    }

    public String a()
    {
        int i1 = b.h();
        String s1 = String.valueOf(ebw.b(b.a()));
        return (new StringBuilder(String.valueOf(s1).length() + 12)).append(i1).append("-").append(s1).toString();
    }

    public void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        String s2;
        s2 = String.valueOf(a());
        if (s2.length() == 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        s2 = "Account registration complete:".concat(s2);
_L2:
        ebw.e("Babel", s2);
        ank.b(g.nS, b, s1);
        if (!TextUtils.isEmpty(s1))
        {
            ank.a(g.nS, b, System.currentTimeMillis());
        }
        f = false;
        g = false;
        this;
        JVM INSTR monitorexit ;
        return;
        s2 = new String("Account registration complete:");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!ebw.a("Babel", 3)) goto _L2; else goto _L1
_L1:
        Object obj = String.valueOf(a());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "register:".concat(((String) (obj)));
_L5:
        ebw.c("Babel", ((String) (obj)));
_L2:
        if (b.e())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        obj = String.valueOf(a());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        obj = "Account not valid for babel. Skip device registration: ".concat(((String) (obj)));
_L6:
        ebw.e("Babel", ((String) (obj)));
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj = new String("register:");
          goto _L5
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = new String("Account not valid for babel. Skip device registration: ");
          goto _L6
        if (!k() || flag1)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        obj = String.valueOf(a());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        obj = "Account already registered. Skip device registration: ".concat(((String) (obj)));
_L8:
        ebw.e("Babel", ((String) (obj)));
        this;
        JVM INSTR monitorexit ;
        return;
        obj = new String("Account already registered. Skip device registration: ");
        if (true) goto _L8; else goto _L7
_L7:
        dbf.E();
        if (!dcx.c().e())
        {
            break MISSING_BLOCK_LABEL_238;
        }
        obj = String.valueOf(a());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        obj = "register - retrying gcm registration:".concat(((String) (obj)));
_L10:
        ebw.e("Babel", ((String) (obj)));
        e = true;
        dbf.E();
        dcx.c().h();
        this;
        JVM INSTR monitorexit ;
        return;
        obj = new String("register - retrying gcm registration:");
        if (true) goto _L10; else goto _L9
_L9:
        dbf.E();
        if (dcx.c().d()) goto _L12; else goto _L11
_L11:
        e = true;
        obj = String.valueOf(a());
        if (((String) (obj)).length() == 0) goto _L14; else goto _L13
_L13:
        obj = "Account registration pending Gcm:".concat(((String) (obj)));
_L15:
        ebw.e("Babel", ((String) (obj)));
_L17:
        this;
        JVM INSTR monitorexit ;
        return;
_L14:
        obj = new String("Account registration pending Gcm:");
          goto _L15
_L12:
        if (b.q()) goto _L17; else goto _L16
_L16:
        obj = String.valueOf(a());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        obj = "Starting account registration:".concat(((String) (obj)));
_L18:
        ebw.e("Babel", ((String) (obj)));
        RealTimeChatService.a(b, h);
        f = true;
        e = false;
          goto _L17
        obj = new String("Starting account registration:");
          goto _L18
    }

    public boolean b()
    {
        return c != null;
    }

    public dbn c()
    {
        this;
        JVM INSTR monitorenter ;
        dbn dbn1 = d;
        this;
        JVM INSTR monitorexit ;
        return dbn1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String d()
    {
        return h().U();
    }

    public String e()
    {
        return b.a();
    }

    public String f()
    {
        return b.ae();
    }

    public int g()
    {
        return b.h();
    }

    public ani h()
    {
        this;
        JVM INSTR monitorenter ;
        ani ani1 = b;
        this;
        JVM INSTR monitorexit ;
        return ani1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int i()
    {
        this;
        JVM INSTR monitorenter ;
        if (!b.q())
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return 102;
        if (a != 100 && a != 101) goto _L2; else goto _L1
_L1:
        if (!b.g()) goto _L4; else goto _L3
_L3:
        a = 108;
_L2:
        int i1;
        if (dbf.D())
        {
            String s1 = a();
            String s2 = String.valueOf(Integer.toString(a));
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 19 + String.valueOf(s2).length())).append("Account ").append(s1).append(" in state: ").append(s2).toString());
        }
        i1 = a;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        if (!k() || !b.e()) goto _L6; else goto _L5
_L5:
        a = 102;
          goto _L2
_L6:
        if (!e && !f) goto _L2; else goto _L7
_L7:
        a = 101;
          goto _L2
    }

    public void j()
    {
        if (dbf.D())
        {
            String s1 = String.valueOf(a());
            if (s1.length() != 0)
            {
                s1 = "Clearing account state for".concat(s1);
            } else
            {
                s1 = new String("Clearing account state for");
            }
            ebw.b("Babel", s1);
        }
        this;
        JVM INSTR monitorenter ;
        a = 100;
        e = false;
        f = false;
        g = false;
        h = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean k()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (o() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean l()
    {
        return i() == 102;
    }

    public boolean m()
    {
        return b.n();
    }

    public boolean n()
    {
        return b.s();
    }

    public String o()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ank.g(g.nS, b);
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void p()
    {
        a(true, false);
    }

    public void q()
    {
        this;
        JVM INSTR monitorenter ;
        if (k()) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = String.valueOf(a());
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s1 = "Account should have been registered:".concat(s1);
_L4:
        ebw.f("Babel", s1);
_L2:
        if (dcx.c().d())
        {
            RealTimeChatService.b(b);
        }
        a(((String) (null)));
        j();
        this;
        JVM INSTR monitorexit ;
        return;
        s1 = new String("Account should have been registered:");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void r()
    {
        ank.a(g.nS, b, -1L);
    }

    public void s()
    {
        ank.o(g.nS, b);
    }

    public boolean t()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ank.g(g.nS, b.h());
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean u()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ank.h(g.nS, b.h());
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
