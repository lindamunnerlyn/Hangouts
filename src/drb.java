// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class drb
{

    public static final boolean a = false;
    private static final Class b[];
    private static final dre c = new dre();
    private static final Integer d = Integer.valueOf(2);

    public static acd a(Context context, dsj dsj1, acd acd, String s)
    {
        acd = (new aci(context, acd)).a();
        if (acd == null || acd.length <= 0)
        {
            throw new IllegalArgumentException("Empty or zero length PDU data");
        } else
        {
            return a(context, dsj1, s, 1, ((byte []) (acd)));
        }
    }

    public static acd a(Context context, dsj dsj1, String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Empty URL to retrieve");
        } else
        {
            return a(context, dsj1, s, 2, null);
        }
    }

    private static acd a(Context context, dsj dsj1, String s, int i, byte abyte0[])
    {
        abyte1 = adf.a(context, s1, abyte0, i, dsk1.b(), dsk1.d, dsk1.f, obj2 instanceof Inet6Address);
        ((dsj) (obj)).a(context, dsk1);
        if (abyte1 == null) goto _L2; else goto _L1
_L1:
        k = abyte1.length;
        if (k <= 0) goto _L2; else goto _L3
_L3:
        dsj1 = (new aco(abyte1)).a();
_L5:
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!drk.j() || dsj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        drk.a(abyte1, dsj1, context);
        return dsj1;
        dsj1;
        ebw.e("Babel_SMS", "MmsSendReceiveManager: Parsing retrieved PDU failure", dsj1);
        dsj1 = null;
        if (true) goto _L5; else goto _L4
_L2:
        return null;
        Object obj;
        if (a)
        {
            obj = String.valueOf("MmsSendReceiveManager.executeMmsRequest: requestUrl=");
            int j;
            if (abyte0 != null)
            {
                j = abyte0.length;
            } else
            {
                j = -1;
            }
            ebw.b("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 50 + String.valueOf(s).length())).append(((String) (obj))).append(s).append(",requestMethod=").append(i).append(",requestData=").append(j).toString());
        }
        obj = dsj1;
        if (dsj1 == null)
        {
            obj = dsj.a(context, null);
        }
        if (!((dsj) (obj)).b())
        {
            throw new dra(135, "No available APN to use");
        }
        dsj1 = null;
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        for (Iterator iterator = ((dsj) (obj)).a().iterator(); iterator.hasNext();)
        {
            dsk dsk1 = (dsk)iterator.next();
            String s1 = String.valueOf(dsk1);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 31)).append("MmsSendReceiveManager: try APN ").append(s1).toString());
            Object obj1;
            Object obj2;
            byte abyte1[];
            int k;
            if (s == null)
            {
                s1 = dsk1.b;
            } else
            {
                s1 = s;
            }
            if (a)
            {
                String s2 = String.valueOf(dsk1);
                ebw.b("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 34 + String.valueOf(s2).length())).append("resolveDestination url: ").append(s1).append(" with apn ").append(s2).toString());
            }
            if (dsk1.b())
            {
                obj1 = dsk1.d;
            } else
            {
                obj1 = Uri.parse(s1).getHost();
            }
            k = b(connectivitymanager);
            ebw.e("Babel_SMS", (new StringBuilder(43)).append("ensureRouteToHost: addressTypes=").append(k).toString());
            obj1 = a(((String) (obj1)), k).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
label0:
                {
                    obj2 = (InetAddress)((Iterator) (obj1)).next();
                    dsj1 = String.valueOf(obj2);
                    ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(dsj1).length() + 37)).append("MmsSendReceiveManager: try inet addr ").append(dsj1).toString());
                    try
                    {
                        if (!a(connectivitymanager, ((InetAddress) (obj2))))
                        {
                            dsj1 = String.valueOf(obj2);
                            throw new IOException((new StringBuilder(String.valueOf(dsj1).length() + 26)).append("Cannot establish route to ").append(dsj1).toString());
                        }
                        break label0;
                    }
                    // Misplaced declaration of an exception variable
                    catch (dsj dsj1)
                    {
                        String s3 = String.valueOf("MmsSendReceiveManager: MMS HTTP request failed with exception for addr=");
                        obj2 = String.valueOf(obj2);
                        String s4 = String.valueOf(dsk1);
                        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s3).length() + 5 + String.valueOf(obj2).length() + String.valueOf(s4).length())).append(s3).append(((String) (obj2))).append(" apn=").append(s4).toString(), dsj1);
                    }
                }
            }
        }

        if (dsj1 != null)
        {
            ebw.e("Babel_SMS", "MMS temporary exception", dsj1);
        }
        throw new drh("MMS HTTP request failed");
_L4:
        return dsj1;
    }

    public static dre a()
    {
        return c;
    }

    public static dsj a(Context context)
    {
label0:
        {
            ebw.e("Babel_SMS", "MmsSendReceiveManager.acquireMmsNetwork");
            synchronized (c)
            {
                c.e = null;
                dre dre2 = c;
                dre2.a = dre2.a + 1;
                d(context);
                if (!c.b)
                {
                    break label0;
                }
                context = c.d;
            }
            return context;
        }
        long l1;
        long l2;
        long l3;
        l2 = SystemClock.elapsedRealtime();
        l1 = g.a(g.nS, "babel_mms_network_acquire_timeout_in_millis", 0x2bf20L);
        l3 = g.a(g.nS, "babel_mms_network_acquire_wait_interval", 15000L);
        long l = l1;
_L2:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        c.wait(Math.min(l, l3));
_L1:
        if (c.b || c.e == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        if (c.e instanceof drh)
        {
            throw (drh)c.e;
        }
        break MISSING_BLOCK_LABEL_169;
        context;
        dre1;
        JVM INSTR monitorexit ;
        throw context;
        InterruptedException interruptedexception;
        interruptedexception;
        ebw.f("Babel_SMS", "MmsSendReceiveManager: acquire network wait interrupted");
          goto _L1
        if (c.e instanceof dra)
        {
            throw (dra)c.e;
        } else
        {
            ebw.e("Babel_SMS", "MmsSendReceiveManager: unknown exception", c.e);
            throw new drh(c.e);
        }
        d(context);
        if (!c.b)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        context = c.d;
        dre1;
        JVM INSTR monitorexit ;
        return context;
        l = l1 - (SystemClock.elapsedRealtime() - l2);
          goto _L2
        throw new drh("Acquiring MMS network timed out");
    }

    private static List a(String s, int i)
    {
        Object obj = new ArrayList();
        if (i == 0) goto _L2; else goto _L1
_L1:
        int j;
        InetAddress ainetaddress[];
        InetAddress inetaddress;
        String s1;
        int k;
        try
        {
            ainetaddress = InetAddress.getAllByName(s);
            k = ainetaddress.length;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Error resolving host: ".concat(s);
            } else
            {
                s = new String("Error resolving host: ");
            }
            ebw.e("Babel_SMS", s, ((Throwable) (obj)));
            throw new drh("Failed to resolve host", ((Throwable) (obj)));
        }
        j = 0;
_L10:
        if (j >= k) goto _L2; else goto _L3
_L3:
        inetaddress = ainetaddress[j];
        if (a)
        {
            s1 = String.valueOf(inetaddress);
            ebw.b("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 26)).append("MMS host resolved address ").append(s1).toString());
        }
        if ((i & 2) == 0) goto _L5; else goto _L4
_L4:
        if (!(inetaddress instanceof Inet6Address)) goto _L5; else goto _L6
_L6:
        ((List) (obj)).add(inetaddress);
          goto _L7
_L5:
        if ((i & 1) == 0) goto _L7; else goto _L8
_L8:
        if (inetaddress instanceof Inet4Address)
        {
            ((List) (obj)).add(inetaddress);
        }
          goto _L7
_L2:
        if (((List) (obj)).size() <= 0)
        {
            ebw.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 74)).append("Failed to resolve host ").append(s).append(" for allowed addressTypes, addressTypes=").append(i).toString());
            throw new drh("Failed to resolve host for allowed address types");
        }
        return ((List) (obj));
_L7:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static boolean a(ConnectivityManager connectivitymanager)
    {
        boolean flag;
        try
        {
            Method method = Class.forName(connectivitymanager.getClass().getName()).getMethod("getMobileDataEnabled", new Class[0]);
            method.setAccessible(true);
            flag = g.a((Boolean)method.invoke(connectivitymanager, new Object[0]), false);
        }
        // Misplaced declaration of an exception variable
        catch (ConnectivityManager connectivitymanager)
        {
            return false;
        }
        return flag;
    }

    private static boolean a(ConnectivityManager connectivitymanager, InetAddress inetaddress)
    {
        if (ebw.a("Babel_SMS", 3))
        {
            String s = String.valueOf(inetaddress);
            ebw.c("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 26)).append("requestRouteToHostAddress ").append(s).toString());
        }
        Method method = connectivitymanager.getClass().getMethod("requestRouteToHostAddress", new Class[] {
            Integer.TYPE, java/net/InetAddress
        });
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        boolean flag = g.a((Boolean)method.invoke(connectivitymanager, new Object[] {
            d, inetaddress
        }), false);
        return flag;
        Exception exception;
        exception;
        String s1 = String.valueOf(exception);
        ebw.g("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 50)).append("Call hidden requestRouteToHostAddress failed with ").append(s1).toString());
        Object obj;
        byte byte0;
        byte byte1;
        byte byte2;
        boolean flag1;
        try
        {
            obj = Integer.TYPE;
            Class class1 = Integer.TYPE;
            obj = Class.forName(connectivitymanager.getClass().getName()).getMethod("requestRouteToHost", new Class[] {
                obj, class1
            });
            ((Method) (obj)).setAccessible(true);
            inetaddress = inetaddress.getAddress();
        }
        // Misplaced declaration of an exception variable
        catch (ConnectivityManager connectivitymanager)
        {
            gbh.a(connectivitymanager.toString());
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ConnectivityManager connectivitymanager)
        {
            gbh.a(connectivitymanager.toString());
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ConnectivityManager connectivitymanager)
        {
            gbh.a(connectivitymanager.toString());
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ConnectivityManager connectivitymanager)
        {
            gbh.a(connectivitymanager.toString());
            return false;
        }
        byte0 = inetaddress[3];
        byte1 = inetaddress[2];
        byte2 = inetaddress[1];
        flag1 = g.a((Boolean)((Method) (obj)).invoke(connectivitymanager, new Object[] {
            Integer.valueOf(2), Integer.valueOf(inetaddress[0] & 0xff | ((byte0 & 0xff) << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8))
        }), false);
        return flag1;
    }

    private static int b(ConnectivityManager connectivitymanager)
    {
        int i = 0;
        connectivitymanager = ((ConnectivityManager) (connectivitymanager.getClass().getMethod("getLinkProperties", new Class[] {
            Integer.TYPE
        }).invoke(connectivitymanager, new Object[] {
            d
        })));
        String s = String.valueOf(connectivitymanager);
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 10)).append("MMS link: ").append(s).toString());
        connectivitymanager = ((Collection)connectivitymanager.getClass().getMethod("getAddresses", new Class[0]).invoke(connectivitymanager, new Object[0])).iterator();
_L2:
        int j = i;
        InetAddress inetaddress;
        if (!connectivitymanager.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        inetaddress = (InetAddress)connectivitymanager.next();
        if (inetaddress instanceof Inet4Address)
        {
            i |= 1;
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = inetaddress instanceof Inet6Address;
        if (flag)
        {
            i |= 2;
        }
        if (true) goto _L2; else goto _L1
        connectivitymanager;
        j = 3;
_L1:
        return j;
    }

    public static void b(Context context)
    {
        dre dre1 = c;
        dre1;
        JVM INSTR monitorenter ;
        int i = c.a;
        ebw.e("Babel_SMS", (new StringBuilder(59)).append("MmsSendReceiveManager.releaseMmsNetwork senders=").append(i).toString());
        dre dre2 = c;
        dre2.a = dre2.a - 1;
        if (c.a > 0) goto _L2; else goto _L1
_L1:
        c.a();
        ebw.e("Babel_SMS", "MmsSendReceiveManager.endMmsConnectivity");
        context = (ConnectivityManager)context.getSystemService("connectivity");
        Method method = context.getClass().getMethod("stopUsingNetworkFeature", b);
        method.setAccessible(true);
        method.invoke(context, new Object[] {
            Integer.valueOf(0), "enableMMS"
        });
_L3:
        c.b = false;
        c.d = null;
_L2:
        return;
        context;
        gbh.a(context.toString());
          goto _L3
        context;
        dre1;
        JVM INSTR monitorexit ;
        throw context;
        context;
        gbh.a(context.toString());
          goto _L3
        context;
        gbh.a(context.toString());
          goto _L3
    }

    public static void c(Context context)
    {
        d(context);
    }

    private static void d(Context context)
    {
        ebw.e("Babel_SMS", "MmsSendReceiveManager.extendMmsNetworkConnectivity");
        if (e(context) == 0)
        {
            dre.a(true, null);
            return;
        } else
        {
            c.b = false;
            return;
        }
    }

    private static int e(Context context)
    {
        ebw.e("Babel_SMS", "MmsSendReceiveManager.beginMmsConnectivity");
        context = (ConnectivityManager)context.getSystemService("connectivity");
        int i;
        try
        {
            Method method = context.getClass().getMethod("startUsingNetworkFeature", b);
            method.setAccessible(true);
            i = g.a((Integer)method.invoke(context, new Object[] {
                Integer.valueOf(0), "enableMMS"
            }), -1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gbh.a(context.toString());
            i = -1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gbh.a(context.toString());
            i = -1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gbh.a(context.toString());
            i = -1;
        }
        switch (i)
        {
        default:
            int j = i;
            if (i >= dsl.a.length)
            {
                j = dsl.a.length - 1;
            }
            context = String.valueOf(dsl.a[j]);
            if (context.length() != 0)
            {
                context = "Cannot establish MMS connectivity: ".concat(context);
            } else
            {
                context = new String("Cannot establish MMS connectivity: ");
            }
            throw new drh(context);

        case 0: // '\0'
        case 1: // '\001'
            return i;
        }
    }

    static 
    {
        b = (new Class[] {
            Integer.TYPE, java/lang/String
        });
        hik hik = ebw.r;
    }
}
