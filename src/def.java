// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class def
    implements ccg
{

    private static final boolean a = false;
    private final deh b;

    public def(deh deh1)
    {
        b = deh1;
    }

    static boolean f()
    {
        return a;
    }

    public String a()
    {
        return "photo_queue";
    }

    public void a(int i, dbo dbo1)
    {
        ani ani1 = dbf.e(i);
        if (ani1 == null)
        {
            if (ebw.a("Babel_MediaUploadNetworkRequest", 3))
            {
                ebw.c("Babel_MediaUploadNetworkRequest", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i).toString());
            }
            return;
        } else
        {
            RealTimeChatService.a(ani1, b, dbo1);
            return;
        }
    }

    public void a(Context context, cci cci, cck cck)
    {
        cci = dbf.e(b.a());
        if (cci == null)
        {
            if (ebw.a("Babel_MediaUploadNetworkRequest", 3))
            {
                int i = b.a();
                ebw.c("Babel_MediaUploadNetworkRequest", (new StringBuilder(57)).append("Skipping process request for invalid account: ").append(i).toString());
            }
            return;
        }
        cck = new deg(this);
        cci = (new har(context)).a(cci.a()).b(cci.b().a).c(cci.ae()).a(cck).a();
        context = String.valueOf(b.b());
        if (context.length() != 0)
        {
            context = "Start uploading local URL -- ".concat(context);
        } else
        {
            context = new String("Start uploading local URL -- ");
        }
        ebw.e("Babel_MediaUploadNetworkRequest", context);
        try
        {
            cci.a((new hbc()).a(Uri.parse(b.b())).a(b.e()).b(b.d()).c(b.c()).a().b().c());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(105, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(114, context, 0L, false, "media changed");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(114, context, 0L, false, "media unavailable");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(114, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(102, context, 0L, false, "connectivity constraint");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(104, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(114, context, 0L, false, "invalid content uri");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(114, context, 0L, false, "invalid content type");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dbo(102, context, 0L, false, "restart; retriable");
        }
    }

    public boolean a(ccg ccg1)
    {
        return false;
    }

    public boolean a(cci cci, dbo dbo1)
    {
        switch (dbo1.c())
        {
        default:
            int i = dbo1.c();
            ebw.f("Babel_MediaUploadNetworkRequest", (new StringBuilder(49)).append("Default no retry on BabelClientError: ").append(i).toString());
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
        return ((alw)hgx.a(g.nS, alw)).a("babel_pending_message_failure_duration", 0x124f80L);
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
        hik hik = ebw.k;
    }
}
