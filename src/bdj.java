// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.hangouts.content.EsProvider;

public final class bdj
    implements aqb
{

    final arl a;
    final Context b;
    apw c;
    String d;
    String e;
    private final ImageView f;
    private final ImageView g;
    private final View h;
    private final View i;
    private final View j;
    private eei k;
    private int l;
    private int m;
    private String n;
    private ffo o;
    private int p;
    private int q;

    public bdj(View view, Context context)
    {
        c = null;
        f = (ImageView)n.b((ImageView)view.findViewById(h.cR));
        h = (View)n.b(view.findViewById(h.bK));
        g = (ImageView)n.b((ImageView)view.findViewById(h.ai));
        j = (View)n.b(view.findViewById(h.eF));
        i = (View)n.b(view.findViewById(h.ah));
        b = (Context)n.b(context);
        a = (arl)hgx.a(context, arl);
    }

    public ang a(String s, String s1)
    {
        return new ang(s, s1, e, p, n, d);
    }

    public void a()
    {
        ebw.c("Babel", "clearPendingAttachment");
        if (i != null)
        {
            i.setVisibility(8);
        }
        if (g != null)
        {
            g.setImageBitmap(null);
        }
        if (k != null)
        {
            k.c();
        }
        b();
        Object obj = e;
        if (obj != null)
        {
            obj = Uri.parse(((String) (obj)));
            if (TextUtils.equals(((Uri) (obj)).getAuthority(), EsProvider.a))
            {
                (new bdm(this, ((Uri) (obj)))).execute(new Void[0]);
            }
        }
        o = null;
        if (c != null)
        {
            ((dmt)hgx.a(b, dmt)).b(c);
            c = null;
        }
    }

    public void a(Bundle bundle)
    {
        bundle.putInt("pending_photo_height", m);
        bundle.putInt("pending_photo_width", l);
        bundle.putString("pending_attachment_content_type", d);
        bundle.putInt("pending_attachment_sent_request_id", q);
    }

    public void a(ang ang1)
    {
        d = ang1.g;
        e = ang1.d;
        p = ang1.e;
        n = ang1.f;
    }

    public void a(ani ani, String s, Uri uri)
    {
        ((TextView)i.findViewById(h.x)).setText(l.tl);
        i.setVisibility(0);
        i.setOnClickListener(new bdl(this, ani));
        h.setVisibility(0);
        g.setImageResource(com.google.android.apps.hangouts.R.drawable.bK);
        e = uri.toString();
        d = s;
    }

    public void a(ebh ebh1, eab eab1, boolean flag, apw apw, boolean flag1)
    {
        int i1 = 0;
        if (apw != c)
        {
            if (ebh1 != null)
            {
                ebh1.b();
            }
            return;
        }
        c = null;
        if (flag)
        {
            if (eab1 != null)
            {
                k = new eei(eab1);
                g.setImageDrawable(k);
                k.a();
                l = eab1.d();
                m = eab1.e();
                if (!g.d(d))
                {
                    d = "image/gif";
                }
            } else
            {
                ebh1 = ebh1.d();
                l = ebh1.getWidth();
                m = ebh1.getHeight();
                g.setImageBitmap(ebh1);
            }
            f.setVisibility(8);
            h.setVisibility(8);
            i.setVisibility(0);
            g.setVisibility(0);
            ebh1 = j;
            if (!g.d(d))
            {
                i1 = 8;
            }
            ebh1.setVisibility(i1);
            j.setOnClickListener(new bdk(this));
            return;
        } else
        {
            a();
            Toast.makeText(g.getContext(), l.r, 1).show();
            return;
        }
    }

    public void a(ffo ffo)
    {
        o = ffo;
        d = "hangouts/location";
    }

    public void a(String s)
    {
        d = s;
    }

    public void b()
    {
        d = null;
        e = null;
        p = 0;
        n = null;
    }

    public void b(Bundle bundle)
    {
        m = bundle.getInt("pending_photo_height");
        l = bundle.getInt("pending_photo_width");
        d = bundle.getString("pending_attachment_content_type");
        q = bundle.getInt("pending_attachment_sent_request_id", 0);
    }

    public void b(String s)
    {
        n = s;
    }

    public void c()
    {
        ((TextView)i.findViewById(h.x)).setText(l.cg);
        i.setVisibility(0);
        i.setOnClickListener(null);
        h.setVisibility(0);
        g.setImageResource(com.google.android.apps.hangouts.R.drawable.aJ);
    }

    public void c(String s)
    {
        e = s;
    }

    public int d()
    {
        return l;
    }

    public int e()
    {
        return m;
    }

    public String f()
    {
        return d;
    }

    public String g()
    {
        return e;
    }

    public int h()
    {
        return p;
    }

    public String i()
    {
        return n;
    }

    public ffo j()
    {
        return o;
    }
}
