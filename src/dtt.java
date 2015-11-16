// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.CellIdentityCdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.List;

public final class dtt
{

    private static int a = -1;

    static int a()
    {
        return a;
    }

    static int a(int i)
    {
        switch (i)
        {
        default:
            return -1;

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 25;

        case 2: // '\002'
            return 50;

        case 3: // '\003'
            return 75;

        case 4: // '\004'
            return 100;
        }
    }

    public static CellInfo a(Context context)
    {
label0:
        {
            if (!g.q(context))
            {
                ebw.e("Babel_telephony", "TeleAccessNetworkInfoUtil.getRegisteredCellInfo, no coarse location permission.");
                return null;
            }
            context = ((TelephonyManager)context.getSystemService("phone")).getAllCellInfo();
            if (context == null)
            {
                break label0;
            }
            context = context.iterator();
            CellInfo cellinfo;
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                cellinfo = (CellInfo)context.next();
            } while (!cellinfo.isRegistered());
            return cellinfo;
        }
        return null;
    }

    static dtv a(Context context, int i, int j)
    {
        TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
        byte byte0 = -1;
        context = a(context);
        int k = byte0;
        if (context != null)
        {
            k = byte0;
            if (context instanceof CellInfoCdma)
            {
                context = ((CellInfoCdma)context).getCellIdentity();
                k = byte0;
                if (context != null)
                {
                    k = context.getSystemId();
                }
            }
        }
        return new dtv(i, j, telephonymanager.getPhoneType(), telephonymanager.getNetworkOperator(), telephonymanager.getNetworkType(), k);
    }

    public static void a(Context context, dtu dtu1)
    {
        TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
        if (telephonymanager.getSimState() == 5)
        {
            context = new dtw(context, dtu1);
            telephonymanager.listen(context, 257);
            telephonymanager.listen(context, 0);
            return;
        } else
        {
            dtu1.a(a(context, 2, -1));
            return;
        }
    }

}
