// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.RemoteException;
import java.io.IOException;
import java.util.Map;

public final class cbr
{

    final String a;
    final Map b = new gz();
    final Map c = new gz();

    public cbr(String s)
    {
        a = s;
    }

    private String a(String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = (String)c.get(s);
        if (s1 != null || !flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        s1 = g.a(s, a, false);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        Object obj;
        long l;
        long l1;
        obj = (Long)b.get(s1);
        l = System.currentTimeMillis();
        l1 = g.a(((Long) (obj)), 0L);
        if (!flag && obj != null && l - l1 <= 0x36ee80L)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        c.remove(s);
        b.remove(s1);
        eic.a(g.nS, s1);
        s1 = null;
        this;
        JVM INSTR monitorexit ;
        obj = s1;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        obj = s1;
        if (a == null) goto _L2; else goto _L3
_L3:
        l = System.currentTimeMillis();
        obj = g.a(s, a, false);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        this;
        JVM INSTR monitorenter ;
        s1 = (String)c.remove(s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        b.remove(s1);
        c.put(s, obj);
        b.put(obj, Long.valueOf(l));
        this;
        JVM INSTR monitorexit ;
_L2:
        return ((String) (obj));
        s;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", "Error getting auth token", s);
            throw new dbo(100, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", "Error getting auth token", s);
            throw new dbo(100, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", "Network error while getting auth token", s);
            throw new dbo(102, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", "Error getting auth token", s);
            throw new dbo(100, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_315;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        throw new dbo(139, s);
        return ((String) (obj));
    }

    public String a(String s)
    {
        return a(s, false);
    }

    public void b(String s)
    {
        try
        {
            g.a(s, a, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.c("Babel", "Trigger Auth Notification: Ignore AccountNotFoundException");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.c("Babel", "Trigger Auth Notification: Ignore AuthenticatorException");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.c("Babel", "Trigger Auth Notification: Ignore OperationCanceledException");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.c("Babel", "Trigger Auth Notification: Ignore IOException");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.c("Babel", "Trigger Auth Notification: Ignore BabelAuthException");
            return;
        }
        ebw.c("Babel", "Trigger Auth Notification: Ignore GooglePlayServicesNotAvailableException | RemoteException | GooglePlayServicesRepairableException");
    }

    public Long c(String s)
    {
        return (Long)b.get(s);
    }

    public void d(String s)
    {
        a(s, true);
    }
}
