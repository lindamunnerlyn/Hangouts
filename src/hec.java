// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.content.Context;
import android.text.TextUtils;

public final class hec
{

    final String a;
    final fxo b;
    final hm c = new hm();
    final hm d = new hm();

    hec(String s, fxo fxo1)
    {
        a = s;
        b = fxo1;
    }

    private String a(Context context, String s, String s1, boolean flag)
    {
        fxq fxq1 = (fxq)hgx.a(context, fxq);
        if (flag)
        {
            return b.a(context, s, s1);
        }
        try
        {
            context = fxq1.a(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AuthenticatorException("Recoverable error", context);
        }
        return context;
    }

    public String a(Context context, String s)
    {
        String s1 = ((hdw)hgx.a(context, hdw)).a();
        if (!TextUtils.isEmpty(s1))
        {
            return s1;
        }
        this;
        JVM INSTR monitorenter ;
        String s2 = (String)d.get(s);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        Long long1 = (Long)c.get(s2);
        boolean flag;
        if (long1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "Missing auth time for auth token");
        if (System.currentTimeMillis() - long1.longValue() > hed.a())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        this;
        JVM INSTR monitorexit ;
        return s2;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        d.remove(s);
        c.remove(s2);
        b.a(context, s2);
        this;
        JVM INSTR monitorexit ;
        long l;
        l = System.currentTimeMillis();
        boolean flag1 = hgx.c(context, "token_with_notification");
        context = a(context, s, a, flag1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        this;
        JVM INSTR monitorenter ;
        s2 = (String)d.remove(s);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        c.remove(s2);
        d.put(s, context);
        c.put(context, Long.valueOf(l));
        this;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_223;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        return context;
    }

    public void b(Context context, String s)
    {
        if (!TextUtils.isEmpty(((hdw)hgx.a(context, hdw)).a()))
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        String s1 = (String)d.remove(s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        c.remove(s1);
        b.a(context, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        this;
        JVM INSTR monitorexit ;
        s = b.a(context, s, a);
        b.a(context, s);
        return;
    }

    public Long c(Context context, String s)
    {
        if (!TextUtils.isEmpty(((hdw)hgx.a(context, hdw)).a()))
        {
            return Long.valueOf(System.currentTimeMillis());
        }
        this;
        JVM INSTR monitorenter ;
        context = (Long)c.get(s);
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }
}
