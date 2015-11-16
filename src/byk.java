// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public final class byk extends ffy
    implements byc
{

    private final int b = Math.round(TypedValue.applyDimension(1, 400F, getResources().getDisplayMetrics()));

    public byk(Context context)
    {
        super(context, (new GoogleMapOptions()).a(g.a(g.nS, "babel_use_lite_mode_maps", djk.f)));
    }

    private int a(int i, int j)
    {
        int k = i;
        switch (j)
        {
        default:
            k = b;
            // fall through

        case 1073741824: 
            return k;

        case -2147483648: 
            return Math.min(b, i);
        }
    }

    static void a(byk byk1, ffv ffv1, double d1, double d2, String s, String s1, 
            ad ad)
    {
        Context context = byk1.getContext();
        if (context != null)
        {
            fgb.a(context);
        }
        if (!g.a(g.nS, "babel_use_lite_mode_maps", djk.f))
        {
            fgd fgd1 = ffv1.a();
            fgd1.b();
            fgd1.a();
            byk1 = new bym(byk1, d1, d2, s, ad);
            try
            {
                ffv1.a.a(new ffw(ffv1, byk1));
            }
            // Misplaced declaration of an exception variable
            catch (byk byk1)
            {
                throw new af(byk1);
            }
        }
        byk1 = new LatLng(d1, d2);
        ad = g.a(byk1);
        try
        {
            ffv1.a.a(ad.a());
        }
        // Misplaced declaration of an exception variable
        catch (byk byk1)
        {
            throw new af(byk1);
        }
        ffv1.a((new MarkerOptions()).a(byk1).a(s).b(s1)).a();
    }

    public void a(ad ad, String s, String s1, double d1, double d2)
    {
        super.a.a(null);
        if (super.a.a() == null)
        {
            Context context = getContext();
            int i = ejn.a(context);
            String s3 = g.a(context, i, ejn.e(context));
            String s2 = g.d(context, i);
            LinearLayout linearlayout = new LinearLayout(getContext());
            linearlayout.setOrientation(1);
            linearlayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            addView(linearlayout);
            TextView textview = new TextView(getContext());
            textview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            textview.setText(s3);
            linearlayout.addView(textview);
            if (s2 != null)
            {
                Button button = new Button(context);
                button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                button.setText(s2);
                linearlayout.addView(button);
                button.setOnClickListener(new ezv(context, i));
            }
        }
        super.a.b();
        a(((fgc) (new byl(this, d1, d2, s, s1, ad))));
        ad = getResources();
        if (!TextUtils.isEmpty(s1))
        {
            if (!TextUtils.isEmpty(s))
            {
                ad = ad.getString(g.mV, new Object[] {
                    s, s1
                });
            } else
            {
                ad = ad.getString(g.mT, new Object[] {
                    s1
                });
            }
        } else
        {
            ad = ad.getString(g.mU);
        }
        setContentDescription(ad);
    }

    public void a(String s)
    {
    }

    public void b()
    {
        super.a.c();
        super.a.d();
    }

    public void c()
    {
    }

    public void d()
    {
    }

    public void f_()
    {
    }

    public void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        i = android.view.View.MeasureSpec.getMode(i);
        j = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(a(k, i), a(l, j)), 0x40000000);
        super.onMeasure(i, i);
    }
}
