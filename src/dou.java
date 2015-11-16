// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public final class dou
{

    private static final boolean b = false;
    private static volatile dou c;
    Set a;
    private final Object d = new Object();
    private int e;
    private final emy f;

    private dou()
    {
        e = 0;
        a = null;
        emz emz1 = new emz(g.nU);
        emz1.a(fph.c, (new fpk()).a(117).a());
        emz1.a(new dov(this));
        emz1.a(new dow(this));
        f = emz1.a();
        eev.a("Babel_medialoader", "GmsAvatarLoader Created.");
    }

    public static dou a()
    {
        if (c == null)
        {
            c = new dou();
        }
        return c;
    }

    static Object a(dou dou1)
    {
        return dou1.d;
    }

    public static String a(Long long1)
    {
        String s = String.valueOf("gmscontact:");
        long1 = String.valueOf(String.valueOf(long1));
        if (long1.length() != 0)
        {
            return s.concat(long1);
        } else
        {
            return new String(s);
        }
    }

    static void a(dou dou1, Status status, ParcelFileDescriptor parcelfiledescriptor, dpw dpw1)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (!status.b() || parcelfiledescriptor == null)
        {
            if (b)
            {
                status = String.valueOf(status);
                parcelfiledescriptor = String.valueOf(parcelfiledescriptor);
                eev.c("Babel_medialoader", (new StringBuilder(String.valueOf(status).length() + 45 + String.valueOf(parcelfiledescriptor).length())).append("GmsAvatarLoader: Avatar loaded: status=").append(status).append("  pfd=").append(parcelfiledescriptor).toString());
            }
            dou1.a(dpw1, ((byte []) (null)));
            return;
        }
        parcelfiledescriptor = new FileInputStream(parcelfiledescriptor.getFileDescriptor());
        int i;
        int j;
        i = parcelfiledescriptor.available();
        status = new byte[i];
        j = parcelfiledescriptor.read(status);
        if (j < i)
        {
            status = obj1;
        }
        try
        {
            parcelfiledescriptor.close();
        }
        // Misplaced declaration of an exception variable
        catch (ParcelFileDescriptor parcelfiledescriptor)
        {
            eev.e("Babel_medialoader", "Error closing avatar file for contact.", parcelfiledescriptor);
        }
_L2:
        dou1.a(dpw1, ((byte []) (status)));
        return;
        status;
        eev.e("Babel_medialoader", "Error reading avatar file for contact.", status);
        parcelfiledescriptor.close();
        status = obj;
        continue; /* Loop/switch isn't completed */
        status;
        eev.e("Babel_medialoader", "Error closing avatar file for contact.", status);
        status = obj;
        if (true) goto _L2; else goto _L1
_L1:
        dou1;
        try
        {
            parcelfiledescriptor.close();
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            eev.e("Babel_medialoader", "Error closing avatar file for contact.", status);
        }
        throw dou1;
    }

    static void a(dou dou1, dpw dpw1)
    {
        dou1.b(dpw1);
    }

    private void a(dpw dpw1, byte abyte0[])
    {
        dpn dpn1 = (dpn)hlp.a(g.nU, dpn);
        if (abyte0 != null)
        {
            dpn1.a(dpw1, new dpm(abyte0, "image/jpeg", false));
        } else
        {
            dpn1.b(dpw1);
        }
        synchronized (d)
        {
            e = e - 1;
            if (e == 0 && (f.e() || f.f()))
            {
                f.d();
                if (b)
                {
                    eev.b("Babel_medialoader", "GmsAvatarLoader disconnect. disconnecting gapi client.");
                }
            }
        }
        return;
        abyte0;
        dpw1;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public static boolean a(String s)
    {
        return !TextUtils.isEmpty(s) && s.startsWith("gmscontact:");
    }

    static int b(dou dou1)
    {
        return dou1.e;
    }

    static void b(dou dou1, dpw dpw1)
    {
        dou1.a(dpw1, ((byte []) (null)));
    }

    private void b(dpw dpw1)
    {
        String s = dpw1.o().n();
        if (!a(s))
        {
            eev.g("Babel_medialoader", "GmsAvatarLoader: Not a valid gms url");
            a(dpw1, ((byte []) (null)));
            return;
        }
        s = s.substring(11);
        if (TextUtils.isEmpty(s))
        {
            eev.g("Babel_medialoader", "GmsAvatarLoader: Empty contact id in gms url");
            a(dpw1, ((byte []) (null)));
            return;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            eev.g("Babel_medialoader", "GmsAvatarLoader: Invalid contact id.");
            a(dpw1, ((byte []) (null)));
            return;
        }
        fph.g.a(f, l).a(new dox(this, dpw1));
    }

    static boolean b()
    {
        return b;
    }

    public void a(dpw dpw1)
    {
        gdv.b();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        e = e + 1;
        if (f.e()) goto _L2; else goto _L1
_L1:
        if (!f.f())
        {
            if (b)
            {
                eev.b("Babel_medialoader", "GmsAvatarLoader connectLocked. connecting gapi client");
            }
            f.b();
        }
          goto _L3
_L5:
        boolean flag;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        eev.a("Babel_medialoader", "GmsAvatarLoader load. Not connected. Adding to queue.");
        if (a == null)
        {
            a = new HashSet();
        }
        a.add(dpw1);
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            b(dpw1);
        }
        return;
_L2:
        flag = true;
        continue; /* Loop/switch isn't completed */
        dpw1;
        obj;
        JVM INSTR monitorexit ;
        throw dpw1;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        hnc hnc = eev.p;
    }
}
