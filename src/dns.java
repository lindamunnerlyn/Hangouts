// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;

public final class dns extends hgb
{

    private Uri b;

    public dns(Context context)
    {
        super(context, (byte)0);
    }

    public static void a(Context context)
    {
        IntentFilter intentfilter;
        try
        {
            f();
            return;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            intentfilter = new IntentFilter();
        }
        intentfilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentfilter.addDataPath(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.getPath(), 0);
        intentfilter.addDataScheme(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.getScheme());
        context.registerReceiver(new dnt(), intentfilter);
    }

    private static Uri b(int i)
    {
        String s;
        SharedPreferences sharedpreferences;
        boolean flag;
        if (i == g.ih || i == g.ig)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        sharedpreferences = g.nS.getSharedPreferences("babel_ringtones", 0);
        if (i == g.ih)
        {
            s = "message_ringtone";
        } else
        if (i == g.ig)
        {
            s = "incoming_call_ringtone";
        } else
        {
            gbh.a((new StringBuilder(26)).append("Unknown resId: ").append(i).toString());
            s = null;
        }
        s = sharedpreferences.getString(s, null);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public static Uri b(Uri uri)
    {
        Uri uri1;
        if (ebi.a.equals(uri))
        {
            uri1 = b(g.ih);
        } else
        {
            uri1 = uri;
            if (ebi.b.equals(uri))
            {
                return b(g.ig);
            }
        }
        return uri1;
    }

    static void c()
    {
        f();
    }

    private static void f()
    {
        android.content.SharedPreferences.Editor editor = g.nS.getSharedPreferences("babel_ringtones", 0).edit();
        Uri uri = ebi.a(g.ih, l.aj, ".ogg", 2);
        if (uri != null)
        {
            editor.putString("message_ringtone", uri.toString());
        }
        uri = ebi.a(g.ig, l.dJ, ".ogg", 1);
        if (uri != null)
        {
            editor.putString("incoming_call_ringtone", uri.toString());
        }
        editor.apply();
    }

    public Uri a()
    {
        return b;
    }

    public void a(Uri uri)
    {
        b = uri;
        b(ebi.a(x(), uri));
    }

    public void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = Uri.parse(s);
        }
        a(((Uri) (s)));
    }

    protected Uri y_()
    {
        if (ebi.a.equals(b))
        {
            return b(g.ih);
        }
        if (ebi.b.equals(b))
        {
            return b(g.ig);
        } else
        {
            return super.y_();
        }
    }
}
