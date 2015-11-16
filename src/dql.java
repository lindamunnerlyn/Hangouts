// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;

public final class dql extends hks
{

    private Uri a;

    public dql(Context context)
    {
        super(context, (byte)0);
    }

    public static Uri a(int i)
    {
        String s;
        SharedPreferences sharedpreferences;
        boolean flag;
        if (i == g.hZ || i == g.hY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        sharedpreferences = g.nU.getSharedPreferences("babel_ringtones", 0);
        if (i == g.hZ)
        {
            s = "message_ringtone";
        } else
        if (i == g.hY)
        {
            s = "incoming_call_ringtone";
        } else
        {
            gdv.a((new StringBuilder(26)).append("Unknown resId: ").append(i).toString());
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

    public static void y_()
    {
        android.content.SharedPreferences.Editor editor = g.nU.getSharedPreferences("babel_ringtones", 0).edit();
        Uri uri = eeg.a(g.hZ, l.ag, ".ogg", 2);
        if (uri != null)
        {
            editor.putString("message_ringtone", uri.toString());
        }
        uri = eeg.a(g.hY, l.ds, ".ogg", 1);
        if (uri != null)
        {
            editor.putString("incoming_call_ringtone", uri.toString());
        }
        editor.apply();
    }

    public void a(Uri uri)
    {
        a = uri;
        b(eeg.a(x(), uri));
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

    public Uri b()
    {
        return a;
    }

    protected Uri c()
    {
        if (eeg.a.equals(a))
        {
            return a(g.hZ);
        }
        if (eeg.b.equals(a))
        {
            return a(g.hY);
        } else
        {
            return super.c();
        }
    }
}
