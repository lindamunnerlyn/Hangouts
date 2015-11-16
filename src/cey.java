// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;

public final class cey
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new cez();
    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;

    public cey(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public static cey a(String s)
    {
        return new cey(s, null);
    }

    public static boolean a(String s, String s1, String s2, String s3)
    {
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s3))
        {
            return s1.equals(s3);
        }
        return s != null && s.equals(s2);
    }

    public static cey b(String s)
    {
        return new cey(null, s);
    }

    public boolean a()
    {
        return TextUtils.isEmpty(a) && TextUtils.isEmpty(b);
    }

    public boolean a(cey cey1)
    {
        if (cey1 == null)
        {
            return false;
        } else
        {
            return a(b, a, cey1.b, cey1.a);
        }
    }

    public boolean a(String s, String s1)
    {
        return a(b, a, s, s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag3 = false;
        boolean flag2 = flag3;
        if (obj != null)
        {
            flag2 = flag3;
            if (obj instanceof cey)
            {
                obj = (cey)obj;
                boolean flag;
                boolean flag1;
                if (b == null)
                {
                    if (((cey) (obj)).b == null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    flag = b.equals(((cey) (obj)).b);
                }
                if (a == null)
                {
                    if (((cey) (obj)).a == null)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                {
                    flag1 = a.equals(((cey) (obj)).a);
                }
                flag2 = flag3;
                if (flag)
                {
                    flag2 = flag3;
                    if (flag1)
                    {
                        flag2 = true;
                    }
                }
            }
        }
        return flag2;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return (i + 0x1475ca) * 31 + j;
    }

    public String toString()
    {
        String s = b;
        String s1 = a;
        return (new StringBuilder(String.valueOf(s).length() + 34 + String.valueOf(s1).length())).append("ParticipantId {chatId: ").append(s).append("  gaiaId: ").append(s1).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        int j;
        if (a != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        if (i != 0)
        {
            parcel.writeString(a);
        }
        if (b != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        if (i != 0)
        {
            parcel.writeString(b);
        }
    }

}
