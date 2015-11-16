// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kwj;
import kwk;
import kwm;
import kwq;
import kws;

public final class clear extends kwm
{

    private static volatile shortDisplayName _emptyArray[];
    public InviteeId inviteeId;
    public String profileId;
    public String profileName;
    public String shortDisplayName;

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (kwq.a)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static _emptyArray parseFrom(kwj kwj1)
    {
        return (new <init>()).mergeFrom(kwj1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kws.mergeFrom(new <init>(), abyte0);
    }

    public <init> clear()
    {
        profileId = null;
        profileName = null;
        inviteeId = null;
        shortDisplayName = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (profileId != null)
        {
            i = j + kwk.b(1, profileId);
        }
        j = i;
        if (profileName != null)
        {
            j = i + kwk.b(2, profileName);
        }
        i = j;
        if (inviteeId != null)
        {
            i = j + kwk.d(3, inviteeId);
        }
        j = i;
        if (shortDisplayName != null)
        {
            j = i + kwk.b(4, shortDisplayName);
        }
        return j;
    }

    public shortDisplayName mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                profileId = kwj1.j();
                break;

            case 18: // '\022'
                profileName = kwj1.j();
                break;

            case 26: // '\032'
                class InviteeId extends kwm
                {

                    private static volatile InviteeId _emptyArray[];
                    public String circleId;
                    public String email;
                    public String phoneNumber;
                    public String profileId;

                    public static InviteeId[] emptyArray()
                    {
                        if (_emptyArray == null)
                        {
                            synchronized (kwq.a)
                            {
                                if (_emptyArray == null)
                                {
                                    _emptyArray = new InviteeId[0];
                                }
                            }
                        }
                        return _emptyArray;
                        exception;
                        obj;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

                    public static InviteeId parseFrom(kwj kwj2)
                    {
                        return (new InviteeId()).mergeFrom(kwj2);
                    }

                    public static InviteeId parseFrom(byte abyte0[])
                    {
                        return (InviteeId)kws.mergeFrom(new InviteeId(), abyte0);
                    }

                    public InviteeId clear()
                    {
                        profileId = null;
                        phoneNumber = null;
                        circleId = null;
                        email = null;
                        unknownFieldData = null;
                        cachedSize = -1;
                        return this;
                    }

                    protected int computeSerializedSize()
                    {
                        int k = super.computeSerializedSize();
                        int j = k;
                        if (profileId != null)
                        {
                            j = k + kwk.b(1, profileId);
                        }
                        k = j;
                        if (phoneNumber != null)
                        {
                            k = j + kwk.b(2, phoneNumber);
                        }
                        j = k;
                        if (circleId != null)
                        {
                            j = k + kwk.b(3, circleId);
                        }
                        k = j;
                        if (email != null)
                        {
                            k = j + kwk.b(4, email);
                        }
                        return k;
                    }

                    public InviteeId mergeFrom(kwj kwj2)
                    {
                        do
                        {
                            int j = kwj2.a();
                            switch (j)
                            {
                            default:
                                if (super.storeUnknownField(kwj2, j))
                                {
                                    continue;
                                }
                                // fall through

                            case 0: // '\0'
                                return this;

                            case 10: // '\n'
                                profileId = kwj2.j();
                                break;

                            case 18: // '\022'
                                phoneNumber = kwj2.j();
                                break;

                            case 26: // '\032'
                                circleId = kwj2.j();
                                break;

                            case 34: // '"'
                                email = kwj2.j();
                                break;
                            }
                        } while (true);
                    }

                    public volatile kws mergeFrom(kwj kwj2)
                    {
                        return mergeFrom(kwj2);
                    }

                    public void writeTo(kwk kwk1)
                    {
                        if (profileId != null)
                        {
                            kwk1.a(1, profileId);
                        }
                        if (phoneNumber != null)
                        {
                            kwk1.a(2, phoneNumber);
                        }
                        if (circleId != null)
                        {
                            kwk1.a(3, circleId);
                        }
                        if (email != null)
                        {
                            kwk1.a(4, email);
                        }
                        super.writeTo(kwk1);
                    }

            public InviteeId()
            {
                clear();
            }
                }

                if (inviteeId == null)
                {
                    inviteeId = new InviteeId();
                }
                kwj1.a(inviteeId);
                break;

            case 34: // '"'
                shortDisplayName = kwj1.j();
                break;
            }
        } while (true);
    }

    public volatile kws mergeFrom(kwj kwj1)
    {
        return mergeFrom(kwj1);
    }

    public void writeTo(kwk kwk1)
    {
        if (profileId != null)
        {
            kwk1.a(1, profileId);
        }
        if (profileName != null)
        {
            kwk1.a(2, profileName);
        }
        if (inviteeId != null)
        {
            kwk1.b(3, inviteeId);
        }
        if (shortDisplayName != null)
        {
            kwk1.a(4, shortDisplayName);
        }
        super.writeTo(kwk1);
    }

    public InviteeId()
    {
        clear();
    }
}
