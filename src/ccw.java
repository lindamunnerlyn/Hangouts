// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.RemoteException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class ccw
{

    final String a;
    final Map b = new gz();
    final Map c = new gz();
    final ReadWriteLock d = new ReentrantReadWriteLock();
    final Lock e;
    final Lock f;

    public ccw(String s)
    {
        e = d.readLock();
        f = d.writeLock();
        a = s;
    }

    private String a(String s, boolean flag)
    {
        f.lock();
        String s1 = (String)c.get(s);
        if (s1 != null || !flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        s1 = g.a(s, a, false);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        Object obj;
        long l;
        long l1;
        obj = (Long)b.get(s1);
        l = System.currentTimeMillis();
        l1 = g.a(((Long) (obj)), 0L);
        if (!flag && obj != null && l - l1 <= 0x36ee80L)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        c.remove(s);
        b.remove(s1);
        eld.a(g.nU, s1);
        s1 = null;
        obj = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        obj = s1;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        l = System.currentTimeMillis();
        obj = g.a(s, a, false);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        s1 = (String)c.remove(s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        b.remove(s1);
        c.put(s, obj);
        b.put(obj, Long.valueOf(l));
        f.unlock();
        return ((String) (obj));
        s;
        eev.e("Babel", "Error getting auth token", s);
        throw new dcx(100, s);
        s;
        f.unlock();
        throw s;
        s;
        eev.e("Babel", "Error getting auth token", s);
        throw new dcx(100, s);
        s;
        eev.e("Babel", "Network error while getting auth token", s);
        throw new dcx(102, s);
        s;
        eev.e("Babel", "Error getting auth token", s);
        throw new dcx(100, s);
_L2:
        throw new dcx(139, s);
        s;
        continue; /* Loop/switch isn't completed */
        s;
        continue; /* Loop/switch isn't completed */
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
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
            eev.c("Babel", "Trigger Auth Notification: Ignore AccountNotFoundException");
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
            eev.c("Babel", "Trigger Auth Notification: Ignore AuthenticatorException");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eev.c("Babel", "Trigger Auth Notification: Ignore OperationCanceledException");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eev.c("Babel", "Trigger Auth Notification: Ignore IOException");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eev.c("Babel", "Trigger Auth Notification: Ignore BabelAuthException");
            return;
        }
        eev.c("Babel", "Trigger Auth Notification: Ignore GooglePlayServicesNotAvailableException | RemoteException | GooglePlayServicesRepairableException");
    }

    public Long c(String s)
    {
        e.lock();
        s = (Long)b.get(s);
        e.unlock();
        return s;
        s;
        e.unlock();
        throw s;
    }

    public void d(String s)
    {
        a(s, true);
    }
}
