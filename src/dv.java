// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class dv
    implements Iterable
{

    private static final dx a;
    private final ArrayList b = new ArrayList();
    private final Context c;

    private dv(Context context)
    {
        c = context;
    }

    private dv a(ComponentName componentname)
    {
        int i = b.size();
        try
        {
            componentname = bu.a(c, componentname);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(componentname);
        }
        if (componentname == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b.add(i, componentname);
        componentname = bu.a(c, componentname.getComponent());
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_17;
_L1:
        return this;
    }

    public static dv a(Context context)
    {
        return new dv(context);
    }

    public int a()
    {
        return b.size();
    }

    public PendingIntent a(int i, int j)
    {
        if (b.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        } else
        {
            Intent aintent[] = (Intent[])b.toArray(new Intent[b.size()]);
            aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
            return a.a(c, aintent, i, j);
        }
    }

    public Intent a(int i)
    {
        return (Intent)b.get(i);
    }

    public dv a(Activity activity)
    {
        Object obj = null;
        if (activity instanceof dw)
        {
            obj = ((dw)activity).s_();
        }
        if (obj == null)
        {
            activity = bu.b(activity);
        } else
        {
            activity = ((Activity) (obj));
        }
        if (activity != null)
        {
            ComponentName componentname = activity.getComponent();
            obj = componentname;
            if (componentname == null)
            {
                obj = activity.resolveActivity(c.getPackageManager());
            }
            a(((ComponentName) (obj)));
            a(((Intent) (activity)));
        }
        return this;
    }

    public dv a(Intent intent)
    {
        b.add(intent);
        return this;
    }

    public dv b(Intent intent)
    {
        ComponentName componentname1 = intent.getComponent();
        ComponentName componentname = componentname1;
        if (componentname1 == null)
        {
            componentname = intent.resolveActivity(c.getPackageManager());
        }
        if (componentname != null)
        {
            a(componentname);
        }
        a(intent);
        return this;
    }

    public void b()
    {
        boolean flag = true;
        if (b.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent aintent[] = (Intent[])b.toArray(new Intent[b.size()]);
        aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
        Context context = c;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16)
        {
            context.startActivities(aintent, null);
        } else
        if (i >= 11)
        {
            context.startActivities(aintent);
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            aintent = new Intent(aintent[aintent.length - 1]);
            aintent.addFlags(0x10000000);
            c.startActivity(aintent);
        }
    }

    public Iterator iterator()
    {
        return b.iterator();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new dz();
        } else
        {
            a = new dy();
        }
    }
}
