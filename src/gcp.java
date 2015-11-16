// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.List;

public class gcp
{

    private final Context a;
    private final ConnectivityManager b;
    private final WifiManager c;
    private final TelephonyManager d;

    public gcp(Context context)
    {
        gkc.b("vclib", "ConnectionMonitor#constructor");
        a = context;
        b = (ConnectivityManager)a.getSystemService("connectivity");
        c = (WifiManager)a.getSystemService("wifi");
        d = (TelephonyManager)a.getSystemService("phone");
    }

    private static boolean c(int i)
    {
        return i == 0 || i == 4 || i == 5 || i == 3;
    }

    public int a()
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return 0;
        } else
        {
            return b(networkinfo.getType());
        }
    }

    public inw a(int i)
    {
        Object obj2;
        inw inw1;
        boolean flag;
        boolean flag1;
        obj2 = null;
        flag1 = true;
        flag = true;
        inw1 = new inw();
        if (i != 1) goto _L2; else goto _L1
_L1:
        NetworkInfo networkinfo = b.getNetworkInfo(1);
        if (networkinfo != null && networkinfo.isConnected())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            gkc.b("vclib", "ConnectionMonitor wifi (not connected");
            i = -1;
        } else
        {
            WifiInfo wifiinfo = c.getConnectionInfo();
            if (wifiinfo == null)
            {
                gkc.b("vclib", "WifiManager.getConnectionInfo() returning null");
                i = -1;
            } else
            {
                i = wifiinfo.getRssi();
                if (i == -200)
                {
                    gkc.b("vclib", "WifiManager.getConnectionInfo().getRssi() not working");
                    i = -1;
                } else
                {
                    i = WifiManager.calculateSignalLevel(i, 100);
                }
            }
        }
_L8:
        inw1.a = Integer.valueOf(i);
_L4:
        return inw1;
_L2:
        if (!c(i)) goto _L4; else goto _L3
_L3:
        Object obj1;
        CellInfo cellinfo;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_438;
        }
        if (a.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0)
        {
            Object obj = d.getAllCellInfo();
            if (obj != null)
            {
                Iterator iterator = ((List) (obj)).iterator();
                obj = null;
                do
                {
                    cellinfo = ((CellInfo) (obj));
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    cellinfo = (CellInfo)iterator.next();
                    if (cellinfo.isRegistered())
                    {
                        obj = cellinfo;
                    }
                } while (true);
            } else
            {
                cellinfo = null;
            }
        } else
        {
            gkc.d("vclib", "Unable to report cell signal strength because the ACCESS_COARSE_LOCATION  permission has not been granted");
            cellinfo = null;
        }
        if (cellinfo == null)
        {
            i = -1;
            obj1 = obj2;
        } else
        if (cellinfo instanceof CellInfoCdma)
        {
            obj1 = ((CellInfoCdma)cellinfo).getCellSignalStrength();
            i = 1;
        } else
        if (cellinfo instanceof CellInfoGsm)
        {
            obj1 = ((CellInfoGsm)cellinfo).getCellSignalStrength();
            i = 2;
        } else
        {
label0:
            {
                if (!(cellinfo instanceof CellInfoLte))
                {
                    break label0;
                }
                obj1 = ((CellInfoLte)cellinfo).getCellSignalStrength();
                i = 3;
            }
        }
_L6:
        inw1.b = Integer.valueOf(i);
        if (obj1 != null)
        {
            inw1.c = Integer.valueOf(((CellSignalStrength) (obj1)).getLevel());
            inw1.d = Integer.valueOf(((CellSignalStrength) (obj1)).getAsuLevel());
            return inw1;
        } else
        {
            inw1.c = Integer.valueOf(-1);
            inw1.d = Integer.valueOf(-1);
            return inw1;
        }
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            break; /* Loop/switch isn't completed */
        }
        if (cellinfo instanceof CellInfoWcdma)
        {
            inw1.b = Integer.valueOf(4);
            obj1 = ((CellInfoWcdma)cellinfo).getCellSignalStrength();
            inw1.c = Integer.valueOf(((CellSignalStrength) (obj1)).getLevel());
            inw1.d = Integer.valueOf(((CellSignalStrength) (obj1)).getAsuLevel());
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0) goto _L4; else goto _L5
_L5:
        i = 0;
        obj1 = obj2;
          goto _L6
        inw1.b = Integer.valueOf(-1);
        inw1.c = Integer.valueOf(-1);
        inw1.d = Integer.valueOf(-1);
        return inw1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public int b(int i)
    {
        if (c(i))
        {
            switch (d.getNetworkType())
            {
            default:
                return 5;

            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 7: // '\007'
            case 11: // '\013'
                return 6;

            case 3: // '\003'
            case 5: // '\005'
            case 6: // '\006'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 12: // '\f'
            case 14: // '\016'
            case 15: // '\017'
                return 7;

            case 13: // '\r'
                return 8;
            }
        }
        switch (i)
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            return 0;

        case 9: // '\t'
            return 1;

        case 1: // '\001'
            return 2;

        case 6: // '\006'
            return 3;

        case 7: // '\007'
            return 4;
        }
    }
}
