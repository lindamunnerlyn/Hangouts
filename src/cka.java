// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.ex.photo.PhotoViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cka extends aam
    implements aak
{

    private ArrayList A;
    private final Runnable B = new ckb(this);

    public cka(aav aav1)
    {
        super(aav1);
        A = new ArrayList();
    }

    private ani u()
    {
        return dbf.e(c().getIntent().getIntExtra("account_id", -1));
    }

    public abd a(Context context, ap ap, float f)
    {
        return new cjz(context, ap, null, f);
    }

    public em a(int i, String s)
    {
        return new cjy(c().i(), s, i, u());
    }

    public void a(abe abe1, boolean flag)
    {
label0:
        {
            if (j.getVisibility() != 8 && abe1.u() == i.c())
            {
                if (!flag)
                {
                    ebw.f("Babel", "Failed to load fragment image");
                }
                abe1 = abe1.r();
                if (!(abe1 instanceof eei))
                {
                    break label0;
                }
                ((eei)abe1).a(B);
            }
            return;
        }
        B.run();
    }

    public void a(Cursor cursor)
    {
        A.clear();
        if (cursor.getCount() > 0)
        {
            long l = System.currentTimeMillis();
            long l1 = ((alw)hgx.a(g.nS, alw)).a("babel_young_image_threshold_millis", 0x493e0);
            cursor.moveToLast();
            do
            {
                if (l - cursor.getLong(7) / 1000L >= l1)
                {
                    break;
                }
                String s = cursor.getString(0);
                A.add(s);
            } while (cursor.moveToPrevious());
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a(((aak) (this)));
    }

    public void d()
    {
        super.d();
        ckc.a();
    }

    public void g()
    {
        super.g();
        ArrayList arraylist = null;
        if (!A.isEmpty())
        {
            arraylist = new ArrayList();
            String s;
            for (Iterator iterator = A.iterator(); iterator.hasNext(); arraylist.add(cjy.a(c().i(), s, 3, u())))
            {
                s = (String)iterator.next();
            }

        }
        ckc.a(z, arraylist);
    }

    public void j()
    {
        Cursor cursor = l();
        if (cursor != null)
        {
            String s1 = cursor.getString(1);
            String s3 = cursor.getString(5);
            long l = cursor.getLong(7) / 1000L;
            String s2 = cursor.getString(6);
            String s4 = cursor.getString(2);
            if (TextUtils.isEmpty(s1))
            {
                o = s3;
                p = g.b(l).toString();
            } else
            {
                String s = s1;
                if (!s4.startsWith(drk.b.toString()))
                {
                    s = Html.fromHtml(s1).toString();
                }
                o = s;
                s = String.valueOf(g.b(l));
                p = (new StringBuilder(String.valueOf(s3).length() + 3 + String.valueOf(s).length())).append(s3).append(" - ").append(s).toString();
            }
            if (!TextUtils.isEmpty(s2))
            {
                Bundle bundle = new Bundle();
                bundle.putString("image_uri", s2);
                c().f().b(1, bundle, y);
            }
        } else
        {
            o = null;
            p = null;
        }
        a(c().j());
    }
}
