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

public final class dlw
{

    private static final boolean b = false;
    private static volatile dlw c;
    Set a;
    private final Object d = new Object();
    private int e;
    private final ejx f;

    private dlw()
    {
        e = 0;
        a = null;
        ejy ejy1 = new ejy(g.nS);
        ejy1.a(fmn.c, (new fmq()).a(117).a());
        ejy1.a(new dlx(this));
        ejy1.a(new dly(this));
        f = ejy1.a();
        ebw.a("Babel_medialoader", "GmsAvatarLoader Created.");
    }

    public static dlw a()
    {
        if (c == null)
        {
            c = new dlw();
        }
        return c;
    }

    static Object a(dlw dlw1)
    {
        return dlw1.d;
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

    static void a(dlw dlw1, Status status, ParcelFileDescriptor parcelfiledescriptor, dnc dnc1)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (!status.e() || parcelfiledescriptor == null)
        {
            if (b)
            {
                status = String.valueOf(status);
                parcelfiledescriptor = String.valueOf(parcelfiledescriptor);
                ebw.c("Babel_medialoader", (new StringBuilder(String.valueOf(status).length() + 45 + String.valueOf(parcelfiledescriptor).length())).append("GmsAvatarLoader: Avatar loaded: status=").append(status).append("  pfd=").append(parcelfiledescriptor).toString());
            }
            dlw1.a(dnc1, ((byte []) (null)));
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
            ebw.e("Babel_medialoader", "Error closing avatar file for contact.", parcelfiledescriptor);
        }
_L2:
        dlw1.a(dnc1, ((byte []) (status)));
        return;
        status;
        ebw.e("Babel_medialoader", "Error reading avatar file for contact.", status);
        parcelfiledescriptor.close();
        status = obj;
        continue; /* Loop/switch isn't completed */
        status;
        ebw.e("Babel_medialoader", "Error closing avatar file for contact.", status);
        status = obj;
        if (true) goto _L2; else goto _L1
_L1:
        dlw1;
        try
        {
            parcelfiledescriptor.close();
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            ebw.e("Babel_medialoader", "Error closing avatar file for contact.", status);
        }
        throw dlw1;
    }

    static void a(dlw dlw1, dnc dnc1)
    {
        dlw1.b(dnc1);
    }

    private void a(dnc dnc1, byte abyte0[])
    {
        dmt dmt1 = (dmt)hgx.a(g.nS, dmt);
        if (abyte0 != null)
        {
            dmt1.a(dnc1, new dms(abyte0, "image/jpeg", false));
        } else
        {
            dmt1.b(dnc1);
        }
        synchronized (d)
        {
            e = e - 1;
            if (e == 0 && (f.e() || f.f()))
            {
                f.d();
                if (b)
                {
                    ebw.b("Babel_medialoader", "GmsAvatarLoader disconnect. disconnecting gapi client.");
                }
            }
        }
        return;
        abyte0;
        dnc1;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public static boolean a(String s)
    {
        return !TextUtils.isEmpty(s) && s.startsWith("gmscontact:");
    }

    static int b(dlw dlw1)
    {
        return dlw1.e;
    }

    static void b(dlw dlw1, dnc dnc1)
    {
        dlw1.a(dnc1, ((byte []) (null)));
    }

    private void b(dnc dnc1)
    {
        String s = dnc1.n().n();
        if (!a(s))
        {
            ebw.g("Babel_medialoader", "GmsAvatarLoader: Not a valid gms url");
            a(dnc1, ((byte []) (null)));
            return;
        }
        s = s.substring(11);
        if (TextUtils.isEmpty(s))
        {
            ebw.g("Babel_medialoader", "GmsAvatarLoader: Empty contact id in gms url");
            a(dnc1, ((byte []) (null)));
            return;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            ebw.g("Babel_medialoader", "GmsAvatarLoader: Invalid contact id.");
            a(dnc1, ((byte []) (null)));
            return;
        }
        fmn.g.a(f, l).a(new dlz(this, dnc1));
    }

    static boolean b()
    {
        return b;
    }

    public void a(dnc dnc1)
    {
        gbh.b();
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
                ebw.b("Babel_medialoader", "GmsAvatarLoader connectLocked. connecting gapi client");
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
        ebw.a("Babel_medialoader", "GmsAvatarLoader load. Not connected. Adding to queue.");
        if (a == null)
        {
            a = new HashSet();
        }
        a.add(dnc1);
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            b(dnc1);
        }
        return;
_L2:
        flag = true;
        continue; /* Loop/switch isn't completed */
        dnc1;
        obj;
        JVM INSTR monitorexit ;
        throw dnc1;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        hik hik = ebw.p;
    }
}
