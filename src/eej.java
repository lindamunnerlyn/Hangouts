// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;
import java.util.Locale;

public final class eej extends edl
{

    private SpannableStringBuilder b;
    private ani c;
    private amf d;
    private int e;
    private AvatarView f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private boolean k;
    private eey l;
    private egi m;

    public eej(Context context, ani ani1)
    {
        this(context, ani1, null, true);
    }

    public eej(Context context, ani ani1, aip aip)
    {
        this(context, ani1, aip, false);
    }

    private eej(Context context, ani ani1, aip aip, boolean flag)
    {
        super(context);
        b = new SpannableStringBuilder();
        c = ani1;
        if (aip != null)
        {
            new een(this, aip);
        }
        Object obj = LayoutInflater.from(context).inflate(g.gT, this);
        f = (AvatarView)((View) (obj)).findViewById(h.E);
        f.e();
        g = (ImageView)((View) (obj)).findViewById(h.ab);
        h = (TextView)((View) (obj)).findViewById(h.dQ);
        i = (TextView)((View) (obj)).findViewById(h.aQ);
        j = (ImageView)((View) (obj)).findViewById(h.cG);
        dsx dsx1 = (dsx)hgx.b(context, dsx);
        if (dsx1 == null)
        {
            m = new egi(i);
        } else
        {
            hjm hjm1 = (hjm)hgx.b(getContext()).a(hiv);
            if (flag)
            {
                aip = this;
            } else
            {
                aip = null;
            }
            m = dsx1.a(hjm1, ani1.h(), i, aip);
        }
        aip = (ViewGroup)((View) (obj)).findViewById(h.dn);
        obj = (egv)hgx.b(context, egv);
        if (obj != null)
        {
            l = ((egv) (obj)).a(aip, ani1.h(), LayoutInflater.from(context));
            return;
        } else
        {
            aip.setVisibility(8);
            return;
        }
    }

    static amf a(eej eej1)
    {
        return eej1.d;
    }

    public amf a()
    {
        return d;
    }

    public void a(amf amf1, String s, boolean flag, int i1)
    {
        String s3;
        d = amf1;
        e = i1;
        s3 = amf1.e();
        k = flag;
        if (!amf1.n()) goto _L2; else goto _L1
_L1:
        j.setVisibility(0);
        m.a(amf1.e(), amf1.i());
        if (l != null)
        {
            l.a(amf1.i());
        }
_L5:
        f.a(amf1.f(), s3, c);
        if (flag)
        {
            g.setImageResource(com.google.android.apps.hangouts.R.drawable.cm);
            g.setContentDescription(getResources().getText(l.ao));
        }
        amf1 = s;
        if (s != null)
        {
            amf1 = s.toUpperCase(Locale.getDefault());
        }
        a(h, s3, b, ((String) (amf1)));
        return;
_L2:
        if (!amf1.q()) goto _L4; else goto _L3
_L3:
        String s1 = amf1.a().c();
_L6:
        if (s1 != null && !s1.equals(s3))
        {
            i.setText(s1);
        } else
        {
            i.setVisibility(8);
        }
        if (true) goto _L5; else goto _L4
_L4:
        String s2 = amf1.c();
        s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = null;
        }
          goto _L6
    }

    public void a(eem eem)
    {
        eek eek1 = null;
        if (eem != null)
        {
            eek1 = new eek(this, eem);
            eem = new eel(this, eem);
        } else
        {
            Object obj = null;
            eem = eek1;
            eek1 = obj;
        }
        f.setOnClickListener(eek1);
        setOnLongClickListener(eem);
    }

    protected void a(boolean flag)
    {
        View view = findViewById(h.ab);
        if (view instanceof Checkable)
        {
            ((Checkable)view).setChecked(isChecked());
        }
        a(view, flag);
    }

    public void a(boolean flag, boolean flag1)
    {
        super.a(flag, flag1);
        if (!k)
        {
            ImageView imageview = g;
            Object obj;
            if (flag)
            {
                obj = getContext().getResources().getText(l.an);
            } else
            {
                obj = "";
            }
            imageview.setContentDescription(((CharSequence) (obj)));
        }
    }

    public int b()
    {
        return e;
    }

    public void k()
    {
        super.k();
        h.setText(null);
        m.a();
        g.setImageResource(com.google.android.apps.hangouts.R.drawable.cc);
        if (l != null)
        {
            l.a(null);
        }
        j.setVisibility(8);
        i.setVisibility(0);
    }
}
