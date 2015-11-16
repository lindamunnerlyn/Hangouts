// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dfn
    implements cdl
{

    private static final boolean a = false;
    private final dfp b;

    public dfn(dfp dfp1)
    {
        b = dfp1;
    }

    private hff a(hfg hfg1)
    {
        String s = String.valueOf(b.d());
        if (s.length() != 0)
        {
            s = "Start uploading local URL -- ".concat(s);
        } else
        {
            s = new String("Start uploading local URL -- ");
        }
        eev.e("Babel_MediaUploadNetworkRequest", s);
        try
        {
            hfg1 = hfg1.a((new hft()).a(Uri.parse(b.d())).a(b.g()).b(b.f()).c(b.e()).a().b().c());
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(105, hfg1);
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(114, hfg1, 0L, false, "media changed");
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(114, hfg1, 0L, false, "media unavailable");
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(114, hfg1);
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(102, hfg1, 0L, false, "connectivity constraint");
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(104, hfg1);
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(114, hfg1, 0L, false, "invalid content uri");
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(114, hfg1, 0L, false, "invalid content type");
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(102, hfg1, 0L, false, "restart; retriable");
        }
        // Misplaced declaration of an exception variable
        catch (hfg hfg1)
        {
            throw new dcx(121, hfg1, 0L, false, "abort");
        }
        return hfg1;
    }

    private static void a(dfp dfp1, int i, long l)
    {
        cab cab1 = (new cab()).a(dfp1.b()).c(dfp1.a()).a(i).b(l);
        h.a(dfp1.c(), SystemClock.elapsedRealtime(), 10, cab1);
    }

    static boolean f()
    {
        return a;
    }

    public String a()
    {
        return "photo_queue";
    }

    public void a(int i, dcx dcx1)
    {
        aoa aoa1 = dcn.e(i);
        if (aoa1 == null)
        {
            if (eev.a("Babel_MediaUploadNetworkRequest", 3))
            {
                eev.c("Babel_MediaUploadNetworkRequest", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        } else
        {
            a(b, 503, dcx1.c());
            RealTimeChatService.a(aoa1, b, dcx1);
            return;
        }
    }

    public void a(Context context, cdn cdn, cdp cdp)
    {
        cdn = dcn.e(b.c());
        if (cdn == null)
        {
            if (eev.a("Babel_MediaUploadNetworkRequest", 3))
            {
                int i = b.c();
                eev.c("Babel_MediaUploadNetworkRequest", (new StringBuilder(57)).append("Skipping process request for invalid account: ").append(i).toString());
            }
            return;
        } else
        {
            cdp = new dfo(this);
            context = (new hfi(context)).a(cdn.a()).b(cdn.b().a).c(cdn.ab()).a(cdp).a();
            a(b, 501, 0L);
            context = a(((hfg) (context)));
            a(b, 502, context.a());
            return;
        }
    }

    public boolean a(cdl cdl1)
    {
        return false;
    }

    public boolean a(cdn cdn, dcx dcx1)
    {
        switch (dcx1.c())
        {
        default:
            int i = dcx1.c();
            eev.f("Babel_MediaUploadNetworkRequest", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
            // fall through

        case 104: // 'h'
        case 114: // 'r'
            return false;

        case 105: // 'i'
            return true;

        case 102: // 'f'
            return true;
        }
    }

    public boolean a(String s)
    {
        return false;
    }

    public long b()
    {
        return ((amo)hlp.a(g.nU, amo)).a("babel_pending_message_failure_duration", 0x124f80L);
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return true;
    }

    public String e()
    {
        return null;
    }

    public String toString()
    {
        String s = String.valueOf(b.toString());
        if (s.length() != 0)
        {
            return "MediaUploadNetworkRequest ".concat(s);
        } else
        {
            return new String("MediaUploadNetworkRequest ");
        }
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
