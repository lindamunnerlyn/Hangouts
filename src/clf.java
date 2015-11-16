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

public final class clf extends aao
    implements aam
{

    private ArrayList B;
    private final Runnable C = new clg(this);

    public clf(aax aax1)
    {
        super(aax1);
        B = new ArrayList();
    }

    private aoa u()
    {
        return dcn.e(c().getIntent().getIntExtra("account_id", -1));
    }

    public abf a(Context context, ap ap, float f)
    {
        return new cle(context, ap, null, f);
    }

    public em a(int i, String s)
    {
        return new cld(c().i(), s, i, u());
    }

    public void a(abg abg1, boolean flag)
    {
label0:
        {
            if (j.getVisibility() != 8 && abg1.u() == i.c())
            {
                if (!flag)
                {
                    eev.f("Babel", "Failed to load fragment image");
                }
                abg1 = abg1.r();
                if (!(abg1 instanceof ehk))
                {
                    break label0;
                }
                ((ehk)abg1).a(C);
            }
            return;
        }
        C.run();
    }

    public void a(Cursor cursor)
    {
        B.clear();
        if (cursor.getCount() > 0)
        {
            long l = System.currentTimeMillis();
            long l1 = ((amo)hlp.a(g.nU, amo)).a("babel_young_image_threshold_millis", 0x493e0);
            cursor.moveToLast();
            do
            {
                if (l - cursor.getLong(7) / 1000L >= l1)
                {
                    break;
                }
                String s = cursor.getString(0);
                B.add(s);
            } while (cursor.moveToPrevious());
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a(((aam) (this)));
    }

    public void d()
    {
        super.d();
        clh.a();
    }

    public void g()
    {
        super.g();
        ArrayList arraylist = null;
        if (!B.isEmpty())
        {
            arraylist = new ArrayList();
            String s;
            for (Iterator iterator = B.iterator(); iterator.hasNext(); arraylist.add(cld.a(c().i(), s, 3, u())))
            {
                s = (String)iterator.next();
            }

        }
        clh.a(A, arraylist);
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
                if (!s4.startsWith(due.b.toString()))
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
                c().f().b(1, bundle, z);
            }
        } else
        {
            o = null;
            p = null;
        }
        a(c().j());
    }
}
