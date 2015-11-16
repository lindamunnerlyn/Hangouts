// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dcq
{

    public int a;
    private final aoa b;
    private final dcq c;
    private final dcw d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public dcq(aoa aoa1, dcq dcq1)
    {
        a = 100;
        e = false;
        f = false;
        g = false;
        h = false;
        b = aoa1;
        d = new dcw(b);
        c = dcq1;
    }

    public String a()
    {
        int i1 = b.h();
        String s1 = String.valueOf(eev.b(b.a()));
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
        eev.e("Babel", s2);
        aoc.b(g.nU, b, s1);
        if (!TextUtils.isEmpty(s1))
        {
            aoc.a(g.nU, b, System.currentTimeMillis());
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
        if (!eev.a("Babel", 3)) goto _L2; else goto _L1
_L1:
        Object obj = String.valueOf(a());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "register:".concat(((String) (obj)));
_L5:
        eev.c("Babel", ((String) (obj)));
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
        eev.e("Babel", ((String) (obj)));
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
        eev.e("Babel", ((String) (obj)));
        this;
        JVM INSTR monitorexit ;
        return;
        obj = new String("Account already registered. Skip device registration: ");
        if (true) goto _L8; else goto _L7
_L7:
        dcn.E();
        if (!def.c().e())
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
        eev.e("Babel", ((String) (obj)));
        e = true;
        dcn.E();
        def.c().h();
        this;
        JVM INSTR monitorexit ;
        return;
        obj = new String("register - retrying gcm registration:");
        if (true) goto _L10; else goto _L9
_L9:
        dcn.E();
        if (def.c().d()) goto _L12; else goto _L11
_L11:
        e = true;
        obj = String.valueOf(a());
        if (((String) (obj)).length() == 0) goto _L14; else goto _L13
_L13:
        obj = "Account registration pending Gcm:".concat(((String) (obj)));
_L15:
        eev.e("Babel", ((String) (obj)));
_L17:
        this;
        JVM INSTR monitorexit ;
        return;
_L14:
        obj = new String("Account registration pending Gcm:");
          goto _L15
_L12:
        if (b.o()) goto _L17; else goto _L16
_L16:
        obj = String.valueOf(a());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        obj = "Starting account registration:".concat(((String) (obj)));
_L18:
        eev.e("Babel", ((String) (obj)));
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

    public dcw c()
    {
        this;
        JVM INSTR monitorenter ;
        dcw dcw1 = d;
        this;
        JVM INSTR monitorexit ;
        return dcw1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String d()
    {
        return h().R();
    }

    public String e()
    {
        return b.a();
    }

    public String f()
    {
        return b.ab();
    }

    public int g()
    {
        return b.h();
    }

    public aoa h()
    {
        this;
        JVM INSTR monitorenter ;
        aoa aoa1 = b;
        this;
        JVM INSTR monitorexit ;
        return aoa1;
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
        if (!b.o())
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
        if (dcn.D())
        {
            String s1 = String.valueOf(a());
            String s2 = String.valueOf(Integer.toString(a));
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 19 + String.valueOf(s2).length())).append("Account ").append(s1).append(" in state: ").append(s2).toString());
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
        if (dcn.D())
        {
            String s1 = String.valueOf(a());
            if (s1.length() != 0)
            {
                s1 = "Clearing account state for".concat(s1);
            } else
            {
                s1 = new String("Clearing account state for");
            }
            eev.b("Babel", s1);
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
        return b.l();
    }

    public boolean n()
    {
        return b.q();
    }

    public String o()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = aoc.g(g.nU, b);
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
        eev.f("Babel", s1);
_L2:
        if (def.c().d())
        {
            RealTimeChatService.b(b);
        }
        a(null);
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
        aoc.a(g.nU, b, -1L);
    }

    public void s()
    {
        aoc.m(g.nU, b);
    }

    void t()
    {
        this;
        JVM INSTR monitorenter ;
        if (b.e())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        String s1 = String.valueOf(a());
        eev.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 61)).append("Account ").append(s1).append(" not valid for babel. Skip device registration renew.").toString());
        this;
        JVM INSTR monitorexit ;
        return;
        if (k() && !g)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        long l1;
        long l2;
        l1 = aoc.i(g.nU, b);
        l2 = System.currentTimeMillis();
        if (l1 - l2 > 0x5265c00L) goto _L2; else goto _L1
_L1:
        if (l2 - l1 <= dcn.a()) goto _L3; else goto _L2
_L2:
        if (!def.c().d()) goto _L3; else goto _L4
_L4:
        if (!eev.a("Babel", 3)) goto _L6; else goto _L5
_L5:
        String s2;
        s2 = String.valueOf(a());
        if (s2.length() == 0)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        s2 = "Renewing account registration:".concat(s2);
_L8:
        eev.c("Babel", s2);
_L6:
        RealTimeChatService.a(b, true);
        g = true;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
        s2 = new String("Renewing account registration:");
        if (true) goto _L8; else goto _L7
_L7:
    }

    void u()
    {
        this;
        JVM INSTR monitorenter ;
        if (b() || b.e())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (!b.o())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        long l1;
        long l2;
        l1 = aoc.l(g.nU, b);
        l2 = System.currentTimeMillis();
        if (l1 - l2 > 0x5265c00L) goto _L2; else goto _L1
_L1:
        if (l2 - l1 <= dcn.b()) goto _L3; else goto _L2
_L2:
        if (!eev.a("Babel", 3)) goto _L5; else goto _L4
_L4:
        String s1;
        s1 = String.valueOf(a());
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s1 = "Renewing account setting:".concat(s1);
_L7:
        eev.c("Babel", s1);
_L5:
        RealTimeChatService.a(b);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
        s1 = new String("Renewing account setting:");
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean v()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = aoc.g(g.nU, b.h());
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean w()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = aoc.h(g.nU, b.h());
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
