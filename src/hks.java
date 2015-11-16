// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;

public class hks extends hjr
    implements hkj
{

    private int a;
    private boolean c;
    private boolean d;
    private int e;

    private hks(Context context)
    {
        this(context, null, g.tN);
    }

    public hks(Context context, byte byte0)
    {
        this(context);
    }

    private hks(Context context, AttributeSet attributeset, int i)
    {
        super(context, null, i);
        context = context.obtainStyledAttributes(null, hkr.au, i, 0);
        a = context.getInt(hkr.av, 1);
        c = context.getBoolean(hkr.aw, true);
        d = context.getBoolean(hkr.ax, true);
        context.recycle();
    }

    protected Object a(TypedArray typedarray, int i)
    {
        return typedarray.getString(i);
    }

    protected void a(hkh hkh1)
    {
        super.a(hkh1);
        hkh1.a(this);
        e = hkh1.j();
    }

    protected void a(boolean flag, Object obj)
    {
        for (obj = (String)obj; flag || TextUtils.isEmpty(((CharSequence) (obj)));)
        {
            return;
        }

        b(Uri.parse(((String) (obj))));
    }

    public boolean a(int i, int j, Intent intent)
    {
        if (i == e)
        {
            if (intent != null)
            {
                Uri uri = (Uri)intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                if (uri != null)
                {
                    intent = uri.toString();
                } else
                {
                    intent = "";
                }
                if (a(intent))
                {
                    b(uri);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void b(int i)
    {
        a = i;
    }

    protected void b(Intent intent)
    {
        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", c());
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", c);
        if (c)
        {
            intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(d()));
        }
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", d);
        intent.putExtra("android.intent.extra.ringtone.TYPE", a);
        intent.putExtra("android.intent.extra.ringtone.TITLE", o());
    }

    protected void b(Uri uri)
    {
        if (uri != null)
        {
            uri = uri.toString();
        } else
        {
            uri = "";
        }
        f(uri);
    }

    public Uri c()
    {
        Uri uri = null;
        String s = g(null);
        if (!TextUtils.isEmpty(s))
        {
            uri = Uri.parse(s);
        }
        return uri;
    }

    public int d()
    {
        return a;
    }

    protected void z_()
    {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        b(intent);
        hjy hjy1 = B().a();
        if (hjy1 != null)
        {
            hjy1.startActivityForResult(intent, e);
            return;
        } else
        {
            B().g().startActivityForResult(intent, e);
            return;
        }
    }
}
