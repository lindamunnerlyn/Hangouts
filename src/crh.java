// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import java.util.Iterator;
import java.util.List;

public final class crh
    implements aep
{

    final ViewVCardActivity a;
    private Handler b;

    public crh(ViewVCardActivity viewvcardactivity, Handler handler)
    {
        a = viewvcardactivity;
        super();
        b = handler;
    }

    public void a()
    {
        ViewVCardActivity.a("onStart");
    }

    public void a(adu adu1)
    {
        Object obj = String.valueOf(adu1.b());
        if (((String) (obj)).length() != 0)
        {
            obj = "onEntryCreated, display name is ".concat(((String) (obj)));
        } else
        {
            obj = new String("onEntryCreated, display name is ");
        }
        ViewVCardActivity.a(((String) (obj)));
        obj = adu1.a;
        if (obj != null)
        {
            Iterator iterator = ((List) (obj)).iterator();
            while (iterator.hasNext()) 
            {
                obj = String.valueOf(((aeh)iterator.next()).toString());
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
            b.obtainMessage(1003, adu1).sendToTarget();
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
