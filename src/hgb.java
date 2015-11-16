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

public class hgb extends hfa
    implements hfs
{

    private int b;
    private boolean c;
    private boolean d;
    private int e;

    private hgb(Context context)
    {
        this(context, null, g.tm);
    }

    public hgb(Context context, byte byte0)
    {
        this(context);
    }

    private hgb(Context context, AttributeSet attributeset, int i)
    {
        super(context, null, i);
        context = context.obtainStyledAttributes(null, hga.au, i, 0);
        b = context.getInt(hga.av, 1);
        c = context.getBoolean(hga.aw, true);
        d = context.getBoolean(hga.ax, true);
        context.recycle();
    }

    protected Object a(TypedArray typedarray, int i)
    {
        return typedarray.getString(i);
    }

    public void a(int i)
    {
        b = i;
    }

    protected void a(hfq hfq1)
    {
        super.a(hfq1);
        hfq1.a(this);
        e = hfq1.j();
    }

    protected void a(boolean flag, Object obj)
    {
        for (obj = (String)obj; flag || TextUtils.isEmpty(((CharSequence) (obj)));)
        {
            return;
        }

        c(Uri.parse(((String) (obj))));
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
                    c(uri);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected void b()
    {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        b(intent);
        hfh hfh1 = B().a();
        if (hfh1 != null)
        {
            hfh1.startActivityForResult(intent, e);
            return;
        } else
        {
            B().g().startActivityForResult(intent, e);
            return;
        }
    }

    protected void b(Intent intent)
    {
        intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", y_());
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", c);
        if (c)
        {
            intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(d()));
        }
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", d);
        intent.putExtra("android.intent.extra.ringtone.TYPE", b);
        intent.putExtra("android.intent.extra.ringtone.TITLE", o());
    }

    protected void c(Uri uri)
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

    public int d()
    {
        return b;
    }

    public Uri y_()
    {
        Uri uri = null;
        String s = g(null);
        if (!TextUtils.isEmpty(s))
        {
            uri = Uri.parse(s);
        }
        return uri;
    }
}
