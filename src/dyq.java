// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

public final class dyq
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new dyr();
    private final int a;
    private final String b;
    private final String c;

    dyq(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public dyq(Context context, int i)
    {
        eaj eaj1;
        a = i;
        b = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
        eaj1 = eaj.a(context);
        context = ((TelephonyManager)context.getSystemService("phone")).getNetworkCountryIso();
        if (context == null) goto _L2; else goto _L1
_L1:
        String s = context.toUpperCase(Locale.US);
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L3
_L3:
        context = s;
        if (!s.equals(eaj1.j()))
        {
            eaj1.b(s);
            context = s;
        }
_L5:
        c = context;
        return;
_L2:
        String s1 = eaj1.j();
        context = s1;
        if (TextUtils.isEmpty(s1))
        {
            eev.e("Babel_telephony", "TeleNetworkStatus.getCurrentNetworkCountryIso, network country is unknown.");
            context = null;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static dyq a(eag eag1)
    {
        String s1 = null;
        String s;
        if (TextUtils.isEmpty(eag1.b))
        {
            s = null;
        } else
        {
            s = eag1.b;
        }
        if (!TextUtils.isEmpty(eag1.c))
        {
            s1 = eag1.c;
        }
        return new dyq(eag1.a, s, s1);
    }

    public int a()
    {
        int i = c();
        if (i != 2 && i != 1 || a == 1)
        {
            return 2;
        }
        return a != 2 ? 3 : 1;
    }

    public String b()
    {
        return b;
    }

    public int c()
    {
        String s = b;
        if (s != null)
        {
            if (s.startsWith("310260"))
            {
                return 2;
            }
            if (s.startsWith("310120"))
            {
                return 1;
            }
            if (s.startsWith("311580"))
            {
                return 3;
            }
            if (s.startsWith("23420"))
            {
                return 4;
            }
            if (s.startsWith("45403"))
            {
                return 5;
            }
        }
        return 0;
    }

    public String d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        if (c == null)
        {
            return 3;
        }
        return !c.equals(Locale.US.getCountry()) ? 2 : 1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (dyq)obj;
            if (a != ((dyq) (obj)).a || !Objects.equals(b, ((dyq) (obj)).b) || !Objects.equals(c, ((dyq) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    eag f()
    {
        eag eag1 = new eag();
        eag1.a = a;
        if (b != null)
        {
            eag1.b = b;
        }
        if (c != null)
        {
            eag1.c = c;
        }
        return eag1;
    }

    public int hashCode()
    {
        int j = a + 31;
        int i = j;
        if (b != null)
        {
            i = j * 31 + b.hashCode();
        }
        j = i;
        if (c != null)
        {
            j = i * 31 + c.hashCode();
        }
        return j;
    }

    public String toString()
    {
        int i = c();
        String s;
        String s1;
        String s2;
        if (i == 2)
        {
            s = "T-Mobile";
        } else
        if (i == 1)
        {
            s = "Sprint";
        } else
        {
            s = String.valueOf(b);
            if (s.length() != 0)
            {
                s = "Uknown carrier: ".concat(s);
            } else
            {
                s = new String("Uknown carrier: ");
            }
        }
        if (a == 1)
        {
            s1 = "roaming";
        } else
        if (a == 2)
        {
            s1 = "not roaming";
        } else
        {
            s1 = "roaming status unknown";
        }
        s2 = c;
        return (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(", ").append(s1).append(", ").append(s2).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
