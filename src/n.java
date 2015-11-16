// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Arrays;

public final class n
    implements a
{

    public static final int a = 0x7f0c025b;
    public static final int b = 0x7f0c02c3;
    public static final int c = 0x7f0c02c4;
    public static final int d = 0x7f0205b3;
    public static final int e = 0x7f0205ce;
    public static final int f = 0x7f0205e3;
    public static final int g = 0x7f0205e4;
    public static final int h = 0x7f0205e9;
    public static final int i = 0x7f020604;
    public static final int j = 0x7f02060a;
    public static final int k = 0x7f02060b;
    public static final int l = 0x7f02061d;
    public static final int m = 0x7f020622;
    public static final int n = 0x7f020626;
    public static final int o = 0x7f0c00ab;
    public static final int p = 0x7f0c0080;
    public static final int q = 0x7f0c0161;
    public static final int r = 0x7f0c0081;
    public static final int s = 0x7f090aa8;
    public static final int t = 0x7f090aa7;
    public static final int u = 0x7f090aa9;
    public static final int v = 0x7f090aa6;

    n()
    {
    }

    public static int a(int i1, int j1)
    {
        if (i1 < 0 || i1 >= j1)
        {
            String s1;
            if (i1 < 0)
            {
                s1 = a("%s (%s) must not be negative", new Object[] {
                    "index", Integer.valueOf(i1)
                });
            } else
            {
                if (j1 < 0)
                {
                    throw new IllegalArgumentException((new StringBuilder("negative size: ")).append(j1).toString());
                }
                s1 = a("%s (%s) must be less than size (%s)", new Object[] {
                    "index", Integer.valueOf(i1), Integer.valueOf(j1)
                });
            }
            throw new IndexOutOfBoundsException(s1);
        } else
        {
            return i1;
        }
    }

    public static transient int a(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    public static String a(int i1)
    {
        switch (i1)
        {
        default:
            return (new StringBuilder("unknown status code: ")).append(i1).toString();

        case -1: 
            return "SUCCESS_CACHE";

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";

        case 13: // '\r'
            return "ERROR_OPERATION_FAILED";

        case 14: // '\016'
            return "INTERRUPTED";

        case 15: // '\017'
            return "TIMEOUT";

        case 16: // '\020'
            return "CANCELED";

        case 3000: 
            return "AUTH_API_INVALID_CREDENTIALS";

        case 3001: 
            return "AUTH_API_ACCESS_FORBIDDEN";

        case 3002: 
            return "AUTH_API_CLIENT_ERROR";

        case 3003: 
            return "AUTH_API_SERVER_ERROR";

        case 3004: 
            return "AUTH_TOKEN_ERROR";

        case 3005: 
            return "AUTH_URL_RESOLUTION";
        }
    }

    private static String a(int i1, int j1, String s1)
    {
        if (i1 < 0)
        {
            return a("%s (%s) must not be negative", new Object[] {
                s1, Integer.valueOf(i1)
            });
        }
        if (j1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("negative size: ")).append(j1).toString());
        } else
        {
            return a("%s (%s) must not be greater than size (%s)", new Object[] {
                s1, Integer.valueOf(i1), Integer.valueOf(j1)
            });
        }
    }

    private static transient String a(String s1, Object aobj[])
    {
        int i1 = 0;
        s1 = String.valueOf(s1);
        StringBuilder stringbuilder = new StringBuilder(s1.length() + aobj.length * 16);
        int j1 = 0;
        do
        {
            if (i1 >= aobj.length)
            {
                break;
            }
            int k1 = s1.indexOf("%s", j1);
            if (k1 == -1)
            {
                break;
            }
            stringbuilder.append(s1.substring(j1, k1));
            stringbuilder.append(aobj[i1]);
            j1 = k1 + 2;
            i1++;
        } while (true);
        stringbuilder.append(s1.substring(j1));
        if (i1 < aobj.length)
        {
            stringbuilder.append(" [");
            stringbuilder.append(aobj[i1]);
            for (i1++; i1 < aobj.length; i1++)
            {
                stringbuilder.append(", ");
                stringbuilder.append(aobj[i1]);
            }

            stringbuilder.append(']');
        }
        return stringbuilder.toString();
    }

    public static jgz a(Object obj)
    {
        return new jgz(h.a(obj.getClass()));
    }

    public static void a(int i1, int j1, int k1)
    {
        if (i1 < 0 || j1 < i1 || j1 > k1)
        {
            String s1;
            if (i1 < 0 || i1 > k1)
            {
                s1 = a(i1, k1, "start index");
            } else
            if (j1 < 0 || j1 > k1)
            {
                s1 = a(j1, k1, "end index");
            } else
            {
                s1 = a("end index (%s) must not be less than start index (%s)", new Object[] {
                    Integer.valueOf(j1), Integer.valueOf(i1)
                });
            }
            throw new IndexOutOfBoundsException(s1);
        } else
        {
            return;
        }
    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void a(boolean flag, String s1, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalArgumentException(a(s1, aobj));
        } else
        {
            return;
        }
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static int b(int i1, int j1)
    {
        if (i1 < 0 || i1 > j1)
        {
            throw new IndexOutOfBoundsException(a(i1, j1, "index"));
        } else
        {
            return i1;
        }
    }

    public static Object b(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public static Object b(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    public static void b(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void b(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void b(boolean flag, String s1, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalStateException(a(s1, aobj));
        } else
        {
            return;
        }
    }

    public void a(View view)
    {
    }
}
