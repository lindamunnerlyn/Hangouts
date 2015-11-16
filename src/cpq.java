// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import java.util.Iterator;
import java.util.List;

public final class cpq
    implements aen
{

    final ViewVCardActivity a;
    private Handler b;

    public cpq(ViewVCardActivity viewvcardactivity, Handler handler)
    {
        a = viewvcardactivity;
        super();
        b = handler;
    }

    public void a()
    {
        ViewVCardActivity.a("onStart");
    }

    public void a(ads ads1)
    {
        Object obj = String.valueOf(ads1.b());
        if (((String) (obj)).length() != 0)
        {
            obj = "onEntryCreated, display name is ".concat(((String) (obj)));
        } else
        {
            obj = new String("onEntryCreated, display name is ");
        }
        ViewVCardActivity.a(((String) (obj)));
        obj = ads1.a;
        if (obj != null)
        {
            Iterator iterator = ((List) (obj)).iterator();
            while (iterator.hasNext()) 
            {
                obj = String.valueOf(((aef)iterator.next()).toString());
                if (((String) (obj)).length() != 0)
                {
                    obj = "onEntryCreated, ".concat(((String) (obj)));
                } else
                {
                    obj = new String("onEntryCreated, ");
                }
                ViewVCardActivity.a(((String) (obj)));
            }
        } else
        {
            ViewVCardActivity.a("onEntryCreated, entry.getPhoneList() is null");
        }
        if (b != null)
        {
            b.obtainMessage(1003, ads1).sendToTarget();
        }
    }

    public void b()
    {
        ViewVCardActivity.a("onEnd");
        if (b != null)
        {
            b.sendEmptyMessage(1001);
        }
    }
}
