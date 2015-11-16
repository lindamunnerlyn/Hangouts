// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.people.data.AudienceMember;

public final class eoj
    implements android.os.Parcelable.Creator
{

    public eoj()
    {
    }

    public static void a(AudienceMember audiencemember, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, audiencemember.b());
        g.b(parcel, 1000, audiencemember.a());
        g.b(parcel, 2, audiencemember.c());
        g.a(parcel, 3, audiencemember.d());
        g.a(parcel, 4, audiencemember.e());
        g.a(parcel, 5, audiencemember.f());
        g.a(parcel, 6, audiencemember.g());
        g.a(parcel, 7, audiencemember.h());
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int l = g.a(parcel);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    g.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, i1);
                    break;

                case 1000: 
                    k = g.e(parcel, i1);
                    break;

                case 2: // '\002'
                    i = g.e(parcel, i1);
                    break;

                case 3: // '\003'
                    s3 = g.i(parcel, i1);
                    break;

                case 4: // '\004'
                    s2 = g.i(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = g.i(parcel, i1);
                    break;

                case 6: // '\006'
                    s = g.i(parcel, i1);
                    break;

                case 7: // '\007'
                    bundle = g.k(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AudienceMember(k, j, i, s3, s2, s1, s, bundle);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new AudienceMember[i];
    }
}
